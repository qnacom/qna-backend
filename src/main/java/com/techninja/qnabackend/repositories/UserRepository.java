package com.techninja.qnabackend.repositories;

import com.techninja.qnabackend.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface UserRepository extends JpaRepository<User,Long> {
    List<User> findAllById(Long userId);

    @Query(value = "select u from User u where u.lastName = ?1")
    List<User> findAllLastName(String lastName);
}
