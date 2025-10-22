package org.ParkingLot.Payments;

public interface IPaymentProcessor {
    boolean processPayment(double amount, String modeOfPayment);
}
