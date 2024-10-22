package com.kamran.project.uber.uberApp.services;

import com.kamran.project.uber.uberApp.entities.Payment;
import com.kamran.project.uber.uberApp.entities.Ride;
import com.kamran.project.uber.uberApp.entities.enums.PaymentStatus;

public interface PaymentService {
    void processPayment(Ride ride);
    Payment createNewPayment(Ride ride);
    void updatePaymentStatus(Payment payment, PaymentStatus status);
}
