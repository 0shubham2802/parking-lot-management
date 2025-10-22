package org.ParkingLot.Gates;

import org.ParkingLot.ParkingFloor.ParkingFloor;
import org.ParkingLot.ParkingSpot.ISpotAllocator;
import org.ParkingLot.ParkingTicket.Ticket;
import org.ParkingLot.Vehicle.Vehicle;

import java.util.UUID;

public class EntryGate implements Gate{
    private final ISpotAllocator allocator;

    public EntryGate(ISpotAllocator allocator) {
        this.allocator = allocator;
    }
    public Ticket generateTicket(ParkingFloor floor, Vehicle vehicle){
        return allocator.assignSpot(floor.getSpots(),vehicle)
                .map(spot -> {
                    spot.occupy();
                    return new Ticket(UUID.randomUUID().toString(),spot.getSpotId(), vehicle.getVehicleNo());
                })
                .orElseThrow(()-> new RuntimeException("No available Parking Spots!"));
    }

    @Override
    public void openGate(){
        System.out.println("Entry gate opened.");
    }

    @Override
    public void closeGate(){
        System.out.println("Entry gate closed.");
    }
}
