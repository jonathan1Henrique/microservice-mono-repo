package com.kafka.paymentservice.model;


import java.io.Serializable;

public class Payment implements Serializable {

    private Long id;
    private Long idUser;
    private Long idProduct;
    private String cardNumber;

}
