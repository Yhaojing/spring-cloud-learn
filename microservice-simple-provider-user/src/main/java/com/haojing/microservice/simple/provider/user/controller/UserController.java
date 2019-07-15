package com.haojing.microservice.simple.provider.user.controller;

import com.haojing.microservice.simple.provider.user.entity.UserEntity;
import com.haojing.microservice.simple.provider.user.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author haoj
 * @date 2019/7/15
 */
@RestController
public class UserController {
    @Autowired
    UserRepository userRepository;


    @GetMapping("/user")
    public UserEntity getUser(@RequestParam String name) {
        return userRepository.findByUsername(name);
    }


    @GetMapping("/user/{id}")
    public UserEntity getUser(@PathVariable Long id) {
        return userRepository.findById(id).orElse(null);
    }

}
