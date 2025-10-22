package org.ParkingLot.ParkingSpot;

import org.ParkingLot.Vehicle.VehicleSize;

public class ParkingSpot {
    private final String spotId;
    private final VehicleSize size;
    private boolean isAvailable;

    public ParkingSpot(String spotId, VehicleSize size) {
        this.spotId = spotId;
        this.size = size;
        this.isAvailable=true;
    }

    public boolean isAvailable() {
        return isAvailable;
    }
    public void occupy(){
        this.isAvailable=false;
    }
    public void release(){
        this.isAvailable=true;
    }

    public String getSpotId() {
        return spotId;
    }

    public VehicleSize getSize() {
        return size;
    }
}
