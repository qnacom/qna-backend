package com.techninja.qnabackend.services;

import com.techninja.qnabackend.controllers.request.AnswerRequest;
import com.techninja.qnabackend.entities.Answer;

public interface AnswerService {
    void saveAnswer(Long testId, Long questionId, AnswerRequest answerRequest);
}
