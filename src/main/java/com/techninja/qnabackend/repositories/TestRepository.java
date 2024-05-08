package com.techninja.qnabackend.repositories;

import com.techninja.qnabackend.entities.Test;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface TestRepository extends JpaRepository<Test, Long> {
   List<Test> findAllByIdIn(List<Long> assignedTestIds);
  /* @Query("SELECT t.id AS test_id, " +
           "t.name AS test_name, " +
           "q.id AS question_id, " +
           "q.question AS question, " +
           "o.option AS option," +
           " o.id AS option_id " +
           "FROM Test t " +
           "INNER JOIN on Question q " +
           "INNER JOIN on Option o " +
           "WHERE t.id = :testId")*/
  @Query(value = "SELECT " +
          "    tt2.id AS test_id, " +
          "    tt2.name AS test_name, " +  // Added comma
          "    tq2.id AS question_id, " +
          "    tq2.question, " +
          "    to2.option, " +
          "    to2.id AS optionid " +
          "FROM " +
          "    Test tt2 " +
          "INNER JOIN " +
          "    Question tq2 ON tt2.id = tq2.testId " +
          "INNER JOIN " +  // Added space
          "    Option to2 ON to2.questionId = tq2.id")
   List<Object[]> findQuestionsAndTestNameByTestId(@Param("testId") Long testId);
}

