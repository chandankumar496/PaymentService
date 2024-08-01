package com.chandan.paymentservice.controllers;

import com.chandan.paymentservice.dtos.InitiatePaymentRequestDto;
import com.chandan.paymentservice.services.PaymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/payments")
public class PaymentController {

    @Autowired
    private PaymentService paymentService;

    @PostMapping
    public String initiatePayment(@RequestBody InitiatePaymentRequestDto initiatePaymentRequestDto) {
         return paymentService.initiatePayment(initiatePaymentRequestDto.getAmount(), initiatePaymentRequestDto.getPhoneNumber()
         , initiatePaymentRequestDto.getName(), initiatePaymentRequestDto.getEmail(), initiatePaymentRequestDto.getOrderId());
    }
}
