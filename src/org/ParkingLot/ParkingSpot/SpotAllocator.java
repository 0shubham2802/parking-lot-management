package org.ParkingLot.ParkingSpot;

import org.ParkingLot.Vehicle.Vehicle;

import java.util.List;
import java.util.Optional;

public class SpotAllocator implements ISpotAllocator{
    @Override
    public Optional<ParkingSpot> assignSpot(List<ParkingSpot> spots, Vehicle vehicle){
        return spots.stream()
                .filter(
                        s->s.isAvailable() && s.getSize().ordinal()>=vehicle.getSize().ordinal()
                )
                .findFirst();
    }

    @Override
    public void releaseSpot(ParkingSpot spot){
        spot.release();
    }

}
