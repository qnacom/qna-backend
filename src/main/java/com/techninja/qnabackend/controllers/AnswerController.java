package com.techninja.qnabackend.controllers;

import com.techninja.qnabackend.controllers.request.AnswerRequest;
import com.techninja.qnabackend.services.AnswerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AnswerController {

    @Autowired
    private AnswerService answerService;

    @PostMapping("/tests/{testId}/questions/{questionId}/answer")
    public ResponseEntity<Void> saveAnswer(@PathVariable Long testId,
                                           @PathVariable Long questionId,
                                           @RequestBody AnswerRequest answerRequest) {
        answerService.saveAnswer(testId, questionId, answerRequest);
        return new ResponseEntity<>(HttpStatus.CREATED);
    }
}
