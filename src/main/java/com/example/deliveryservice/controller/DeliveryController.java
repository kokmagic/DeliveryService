package com.example.deliveryservice.controller;

import com.example.deliveryservice.dto.DeliveryDto;
import com.example.deliveryservice.entity.Delivery;
import com.example.deliveryservice.mapper.DeliveryMapper;
import com.example.deliveryservice.repository.DeliveryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/delivery")
public class DeliveryController {

    private final DeliveryRepository deliveryRepository;
    private final DeliveryMapper deliveryMapper;

    @Autowired
    public DeliveryController (DeliveryRepository deliveryRepository, DeliveryMapper deliveryMapper) {
        this.deliveryRepository = deliveryRepository;
        this.deliveryMapper = deliveryMapper;
    }

    @PostMapping("/create")
    public HttpStatus createDelivery (@RequestBody DeliveryDto deliveryDto) {
        if (deliveryDto != null) {
            Delivery delivery = deliveryMapper.deliveryDtoToDelivery(deliveryDto);
            deliveryRepository.save(delivery);
            return HttpStatus.CREATED;
        } else {
            return HttpStatus.BAD_REQUEST;
        }
    }


}
