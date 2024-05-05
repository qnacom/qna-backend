package com.techninja.qnabackend.repositories;

import com.techninja.qnabackend.entities.Question;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface QuestionRepository extends JpaRepository<Question, Long> {

    List<Question> findAllByTestId(Long testId);

    List<Question> findAllIdByTestId(Long testId);
}
