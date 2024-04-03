package com.techninja.qnabackend.repositories;

import com.techninja.qnabackend.entities.Option;
import com.techninja.qnabackend.entities.Question;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface OptionRepository extends JpaRepository<Option, Long> {

    List<Option> findAllByQuestionId(Long questionId);
}
