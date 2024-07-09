package com.techninja.qnabackend.repositories;

import com.techninja.qnabackend.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface UserRepository extends JpaRepository<User,Long> {
    List<User> findAllById(Long userId);
    Optional<User> findById(Long userId);
}
