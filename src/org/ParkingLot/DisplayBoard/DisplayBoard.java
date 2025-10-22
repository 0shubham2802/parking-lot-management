package org.ParkingLot.DisplayBoard;

import org.ParkingLot.ParkingSpot.ParkingSpot;

import java.util.List;

public class DisplayBoard {
    public void showAvailableSpots(List<ParkingSpot> spots){
        System.out.println("Available Spots:");
        for (ParkingSpot spot:spots){
            if (spot.isAvailable()){
                System.out.println(" -"+spot.getSpotId()+" (" +spot.getSize() + ")");
            }
        }
    }
}
