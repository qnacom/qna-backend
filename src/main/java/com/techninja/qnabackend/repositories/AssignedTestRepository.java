package com.techninja.qnabackend.repositories;

import com.techninja.qnabackend.entities.AssignedTest;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface AssignedTestRepository extends JpaRepository<AssignedTest , Long> {
    List<AssignedTest> findAllByUserId(Long userId);
    AssignedTest findByUserIdAndTestId(Long userID,Long testId);
}
