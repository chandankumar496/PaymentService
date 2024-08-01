package com.chandan.paymentservice.dtos;


import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class InitiatePaymentRequestDto {

    private Long amount;

    private String phoneNumber;

    private String name;

    private String email;

    private String orderId;
}
