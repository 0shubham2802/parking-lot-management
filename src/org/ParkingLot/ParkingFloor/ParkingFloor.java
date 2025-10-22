package org.ParkingLot.ParkingFloor;

import org.ParkingLot.ParkingSpot.ParkingSpot;

import java.util.List;

public class ParkingFloor {
    private final String floorId;
    private final List<ParkingSpot> spots;

    public ParkingFloor(String floorId, List<ParkingSpot> spots) {
        this.floorId = floorId;
        this.spots = spots;
    }

    public String getFloorId() {
        return floorId;
    }

    public List<ParkingSpot> getSpots() {
        return spots;
    }
}
