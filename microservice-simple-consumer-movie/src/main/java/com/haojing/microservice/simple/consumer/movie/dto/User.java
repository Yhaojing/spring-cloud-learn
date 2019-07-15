package com.haojing.microservice.simple.consumer.movie.dto;

import lombok.Data;

import java.math.BigDecimal;

/**
 * @author haoj
 * @date 2019/7/15
 */
@Data
public class User {
    private Long id;

    private String username;

    private String name;

    private Integer age;

    private BigDecimal balance;
}
