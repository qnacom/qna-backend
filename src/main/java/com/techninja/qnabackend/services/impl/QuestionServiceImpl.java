package com.techninja.qnabackend.services.impl;

import com.techninja.qnabackend.repositories.OptionRepository;
import com.techninja.qnabackend.repositories.QuestionRepository;
import com.techninja.qnabackend.services.QuestionService;
import com.techninja.qnabackend.views.OptionView;
import com.techninja.qnabackend.views.QuestionView;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class QuestionServiceImpl implements QuestionService {

    @Autowired
    private QuestionRepository questionRepository;

    @Autowired
    private OptionRepository optionRepository;

    @Override
    public List<QuestionView> getAllQuestionsOf(Long testId) {
        return questionRepository.findAllByTestId(testId)
                .stream()
                .map(question -> {
                    List<OptionView> options = optionRepository.findAllByQuestionId(question.getId())
                            .stream()
                            .map(option -> new OptionView(option.getId(), option.getOption()))
                            .toList();

                    return new QuestionView(question.getId(), question.getQuestion(), options);
                })
                .toList();
    }
}
