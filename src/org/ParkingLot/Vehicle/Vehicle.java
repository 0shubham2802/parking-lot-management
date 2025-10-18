package org.ParkingLot.Vehicle;

public class Vehicle {
    private String vehicleNo;
    private VehicleSize size;

    //Constructors

    public Vehicle(String vehicleNo, VehicleSize size) {
        this.vehicleNo = vehicleNo;
        this.size = size;

    }


    //Getters and Setters
    public String getVehicleNo() {
        return vehicleNo;
    }

    public void setVehicleNo(String vehicleNo) {
        this.vehicleNo = vehicleNo;
    }

    public VehicleSize getSize() {
        return size;
    }

    public void setSize(VehicleSize size) {
        this.size = size;
    }
}
