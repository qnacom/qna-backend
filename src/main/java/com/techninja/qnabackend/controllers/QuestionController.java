package com.techninja.qnabackend.controllers;

import com.techninja.qnabackend.entities.Question;
import com.techninja.qnabackend.services.QuestionService;
import com.techninja.qnabackend.views.QuestionView;
import org.springframework.beans.factory.annotation.Autowired;
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
    /**
     * TODO: Remove this api
     */
    @GetMapping("/tests/{testId}/question")
    public  List<QuestionView> getQuestionWithId(@PathVariable Long testId) {
        return  questionService.allQuestionByTestId(testId);
    }
    @GetMapping("test/questions/{testId}")
    public List<QuestionView> questionList(@PathVariable Long testId)
    {
        return  questionService.allQuestion(testId);
    }
}
