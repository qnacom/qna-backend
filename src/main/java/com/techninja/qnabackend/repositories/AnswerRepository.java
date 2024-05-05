package com.techninja.qnabackend.repositories;

import com.techninja.qnabackend.entities.Answer;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface AnswerRepository extends JpaRepository<Answer, Long> {
    List<Answer> findAllByQuestionId(Long questionId);

    List<Answer> findAllByUserId(Long UserId);
}
