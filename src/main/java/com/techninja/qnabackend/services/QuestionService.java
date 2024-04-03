package com.techninja.qnabackend.services;

import com.techninja.qnabackend.views.QuestionView;

import java.util.List;

public interface QuestionService {

    List<QuestionView> getAllQuestionsOf(Long testId);
}
