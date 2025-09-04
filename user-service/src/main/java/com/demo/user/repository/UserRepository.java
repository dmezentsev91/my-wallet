package com.demo.user.repository;

import com.demo.user.model.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.UUID;

public interface UserRepository extends JpaRepository<UserEntity, UUID> {
}
