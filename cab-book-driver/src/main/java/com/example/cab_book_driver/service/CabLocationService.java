package com.example.cab_book_driver.service;

import com.example.cab_book_driver.constant.AppConstant;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class CabLocationService {
    @Autowired
    private KafkaTemplate<String, Object> kafkaTempalte;

    public boolean updateLocation(String location){
        //using kafka template to send data to a topic created by spring boot
        kafkaTempalte.send(AppConstant.CAB_LOCATION, location);
        return true;
    }
}
