package org.ParkingLot.ParkingLot;

import org.ParkingLot.ParkingFloor.ParkingFloor;

import java.util.List;

public class ParkingLot {
    private final String lotId;
    private final List<ParkingFloor> floors;

    public ParkingLot(String lotId, List<ParkingFloor> floors) {
        this.lotId = lotId;
        this.floors = floors;
    }

    public String getLotId() {
        return lotId;
    }

    public List<ParkingFloor> getFloors() {
        return floors;
    }
}
