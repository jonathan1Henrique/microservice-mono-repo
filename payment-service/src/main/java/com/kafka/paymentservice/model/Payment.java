package com.kafka.paymentservice.model;


import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

@Getter
public class Payment implements Serializable {

    private Long id;
    private Long idUser;
    private Long idProduct;
    private String cardNumber;

}
