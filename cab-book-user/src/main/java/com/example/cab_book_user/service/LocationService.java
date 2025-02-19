package com.example.cab_book_user.service;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class LocationService {
    /**
     * Kafka listener which listen to messages from the topic "cab-location" of the
     * cab-book-driver service
     */
    @KafkaListener(topics="cab-location", groupId = "user-group")
    public void cabLocation(String location) {
        System.out.println(location);
    }
}
