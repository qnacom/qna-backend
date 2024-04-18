package com.techninja.qnabackend.services.impl;

import com.techninja.qnabackend.controllers.request.AnswerRequest;
import com.techninja.qnabackend.entities.Answer;
import com.techninja.qnabackend.repositories.AnswerRepository;
import com.techninja.qnabackend.services.AnswerService;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.Random;
import java.util.random.RandomGenerator;

@Service
public class AnswerServiceImpl implements AnswerService {

    private final AnswerRepository answerRepository;

    public AnswerServiceImpl(AnswerRepository answerRepository) {
        this.answerRepository = answerRepository;
    }

    @Override
    public void saveAnswer(Long testId, Long questionId, AnswerRequest answerRequest) {
        Answer answer = new Answer(questionId,
                answerRequest.getOptionId(),
                answerRequest.getUserId(),
                LocalDateTime.now(),
                LocalDateTime.now()
        );

        answerRepository.save(answer);
    }
}
