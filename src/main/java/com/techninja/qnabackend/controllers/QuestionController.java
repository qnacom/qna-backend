package com.techninja.qnabackend.controllers;

import com.techninja.qnabackend.entities.Question;
import com.techninja.qnabackend.services.QuestionService;
import com.techninja.qnabackend.views.QuestionView;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class QuestionController {

    @Autowired
    private QuestionService questionService;

    @GetMapping("/tests/{testId}/questions")
    public List<QuestionView> getQuestions(@PathVariable Long testId) {
        return questionService.getAllQuestionsOf(testId);
    }
}
