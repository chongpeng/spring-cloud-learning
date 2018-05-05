package com.springcloud.consumer.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.springcloud.consumer.domain.User;

@Service
public class ConsumerService {

    @Autowired
    private RestTemplate restTemplate;

    public User findById(Long id) {
        return restTemplate.getForObject("http://SPRING-CLOUD-PRODUCER/user/" + id, User.class);
    }
}