package com.techninja.qnabackend.repositories;

import com.techninja.qnabackend.entities.Test;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface TestRepository extends JpaRepository<Test, Long> {
   List<Test> findAllByIdIn(List<Long> assignedTestIds);
   Long findIdByName(String name);
}

