package com.haojing.microservice.simple.consumer.movie.controller;

import com.haojing.microservice.simple.consumer.movie.dto.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.HashMap;
import java.util.Map;

/**
 * @author haoj
 * @date 2019/7/15
 */
@RestController
public class MovieController {
    @Autowired
    RestTemplate restTemplate;

    @GetMapping("/user")
    public User getUser(@RequestParam Long  id) {
        return this.restTemplate.getForObject("http://localhost:8000/user/" + id, User.class);
    }
}
