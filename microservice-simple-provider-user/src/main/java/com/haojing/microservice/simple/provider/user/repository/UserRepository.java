package com.haojing.microservice.simple.provider.user.repository;

import com.haojing.microservice.simple.provider.user.entity.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * @author haoj
 * @date 2019/7/15
 */
@Repository
public interface UserRepository extends JpaRepository<UserEntity, Long> {
    UserEntity findByUsername(String name);
}
