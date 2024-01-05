package com.example.deliveryservice.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Entity
@Getter
@Setter
@Table(name = "deliveries")
public class Delivery {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String address;

    private String deliveryType;

    private Long orderId;

    private LocalDate deliveryDate;

    public Delivery() {

    }
    public Delivery (String address, String deliveryType, Long orderId, LocalDate deliveryDate) {
        this.address = address;
        this.deliveryType = deliveryType;
        this.orderId = orderId;
        this.deliveryDate = deliveryDate;
    }
}
