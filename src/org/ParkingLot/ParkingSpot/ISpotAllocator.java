package org.ParkingLot.ParkingSpot;

import org.ParkingLot.Vehicle.Vehicle;

import java.util.List;
import java.util.Optional;

public interface ISpotAllocator {
    Optional<ParkingSpot> assignSpot(List<ParkingSpot> spots, Vehicle vehicle);
    void releaseSpot(ParkingSpot spot);
}
