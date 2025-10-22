package org.ParkingLot;

import org.ParkingLot.DisplayBoard.DisplayBoard;
import org.ParkingLot.Gates.EntryGate;
import org.ParkingLot.Gates.ExitGate;
import org.ParkingLot.Gates.Gate;
import org.ParkingLot.ParkingFloor.ParkingFloor;
import org.ParkingLot.ParkingLot.ParkingLot;
import org.ParkingLot.ParkingSpot.ISpotAllocator;
import org.ParkingLot.ParkingSpot.ParkingSpot;
import org.ParkingLot.ParkingSpot.SpotAllocator;
import org.ParkingLot.ParkingTicket.Ticket;
import org.ParkingLot.Payments.IPaymentProcessor;
import org.ParkingLot.Payments.PaymentProcessor;
import org.ParkingLot.Vehicle.Vehicle;
import org.ParkingLot.Vehicle.VehicleSize;

import java.util.List;


public class Main {
    public static void main(String[] args) {
        ISpotAllocator allocator = new SpotAllocator();
        IPaymentProcessor paymentProcessor = new PaymentProcessor();
        Gate entryGate = new EntryGate(allocator);
        Gate exitGate = new ExitGate(paymentProcessor, allocator);


        ParkingSpot s1 = new ParkingSpot("S1", VehicleSize.SMALL);
        ParkingSpot s2 = new ParkingSpot("S2", VehicleSize.MEDIUM);
        ParkingFloor floor = new ParkingFloor("F1", List.of(s1, s2));
        ParkingLot lot = new ParkingLot("L1", List.of(floor));
        DisplayBoard board = new DisplayBoard();



        Vehicle vehicle = new Vehicle("MH12AB1234", VehicleSize.SMALL);
        ((EntryGate) entryGate).openGate();
        Ticket ticket = ((EntryGate) entryGate).generateTicket(floor, vehicle);
        ((EntryGate) entryGate).closeGate();

        board.showAvailableSpots(floor.getSpots());

        // Use case: Exit
        ((ExitGate) exitGate).openGate();
        ((ExitGate) exitGate).processExit(ticket, s1, "UPI");
        ((ExitGate) exitGate).closeGate();
    }
}
