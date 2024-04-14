package com.techninja.qnabackend.repositories;

import com.techninja.qnabackend.entities.Test;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface TestRepository extends JpaRepository<Test, Long> {
   List<Test> findAllByIdIn(List<Long> assignedTestIds);
}

