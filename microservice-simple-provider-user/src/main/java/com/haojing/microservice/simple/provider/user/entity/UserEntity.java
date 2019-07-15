package com.haojing.microservice.simple.provider.user.entity;

import lombok.Data;

import javax.persistence.*;
import java.math.BigDecimal;

/**
 * @author haoj
 * @date 2019/7/15
 */
@Entity
@Table(name = "user")
@Data
public class UserEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(length = 20)
    private Long id;

    @Column(length = 100, nullable = false)
    private String username;

    @Column(length = 10, nullable = false)
    private String name;

    @Column(length = 11, nullable = false)
    private Integer age;

    @Column(length = 16, nullable = true)
    private BigDecimal balance;

}
