package com.chandan.paymentservice.paymentgateway;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class PaymentGatewayStrategyChooser {

    @Autowired
    private RazorpayPaymentGateway razorpayPaymentGateway;

    @Autowired
    private StripePaymentGateway stripePaymentGateway;

    public PaymentGateway getBestPaymentGateway() {
       // return razorpayPaymentGateway;
        return stripePaymentGateway;
    }
}
