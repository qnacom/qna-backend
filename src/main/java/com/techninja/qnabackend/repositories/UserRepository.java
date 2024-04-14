package com.techninja.qnabackend.repositories;

import com.techninja.qnabackend.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface UserRepository extends JpaRepository<User,Long> {
    List<User> findAllById(Long userId);
}
