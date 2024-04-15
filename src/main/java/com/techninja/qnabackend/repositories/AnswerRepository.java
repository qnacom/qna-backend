package com.techninja.qnabackend.repositories;

import com.techninja.qnabackend.entities.Answer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AnswerRepository extends JpaRepository<Answer, Long> {
}
