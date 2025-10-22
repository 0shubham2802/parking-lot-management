package org.ParkingLot.Payments;

public class PaymentProcessor implements IPaymentProcessor {
    @Override
    public boolean processPayment(double amount, String modeOfPayment) {
        System.out.println("Processing " + amount + " via " + modeOfPayment);
        return true;
    }
}
