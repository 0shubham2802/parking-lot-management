package org.ParkingLot.ParkingTicket;

import java.time.LocalDateTime;

public class Ticket {
    private final String TicketId;
    private final String SpotId;
    private final String vehicleNo;
    private final LocalDateTime entryTime;
    private LocalDateTime exitTime;
    private Double PricePerHour=20.0;

    public Ticket(String ticketId, String spotId, String vehicleNo) {
        this.TicketId = ticketId;
        this.SpotId = spotId;
        this.vehicleNo = vehicleNo;
        this.entryTime = LocalDateTime.now();
    }

    public void MarkExit(){
        this.exitTime=LocalDateTime.now();
    }

    public double calculateFee(){
        long hours=java.time.Duration.between(entryTime,exitTime).toHours();
        return Math.max(1,hours)*PricePerHour;
    }

    public String getTicketId() {
        return TicketId;
    }

    public String getSpotId() {
        return SpotId;
    }

    public String getVehicleNo() {
        return vehicleNo;
    }
}
