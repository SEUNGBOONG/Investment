package com.example.spring.user.repsotiory;

import com.example.spring.user.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository {
    void save(User user);
}
