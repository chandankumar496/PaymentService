package com.chandan.paymentservice.paymentgateway;

public interface PaymentGateway {

    String generatePaymentLink( Long amount, String phoneNumber, String name, String email, String orderId );
}
