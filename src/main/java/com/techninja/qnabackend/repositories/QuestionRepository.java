package com.techninja.qnabackend.repositories;

import com.techninja.qnabackend.entities.Question;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface QuestionRepository extends JpaRepository<Question, Long> {

    List<Question> findAllByTestId(Long testId);
    @Query(value = "select q from Question q where q.testId=?1")
    List<Question> findQuestion(Long testId);

}
