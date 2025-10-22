package org.ParkingLot.Gates;

import org.ParkingLot.ParkingSpot.ISpotAllocator;
import org.ParkingLot.ParkingSpot.ParkingSpot;
import org.ParkingLot.ParkingTicket.Ticket;
import org.ParkingLot.Payments.IPaymentProcessor;

public class ExitGate implements Gate{
    private final IPaymentProcessor PaymentProcessor;
    private final ISpotAllocator allocator;


    public ExitGate(IPaymentProcessor PaymentProcessor, ISpotAllocator allocator) {
        this.PaymentProcessor = PaymentProcessor;
        this.allocator = allocator;
    }

    public void processExit(Ticket ticket, ParkingSpot spot,String modeOfPayment){
        ticket.MarkExit();
        double amount=ticket.calculateFee();

        if (PaymentProcessor.processPayment(amount,modeOfPayment)){
            allocator.releaseSpot(spot);
            System.out.println("Vehicle exited successfully. Total fee: " + amount);
        }
    }

    @Override
    public void openGate() {
        System.out.println("Exit gate opened.");
    }

    @Override
    public void closeGate() {
        System.out.println("Exit gate closed.");
    }
}
