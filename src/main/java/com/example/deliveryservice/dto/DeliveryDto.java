package com.example.deliveryservice.dto;

import lombok.*;

import java.time.LocalDate;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class DeliveryDto {
    private String address;

    private String deliveryType;

    private Long orderId;

    private LocalDate deliveryDate;
}
