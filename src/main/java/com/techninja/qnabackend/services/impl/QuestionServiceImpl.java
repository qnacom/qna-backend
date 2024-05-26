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
    public List<QuestionView> getAllQuestionsOf(Long testID) {

        return questionRepository.findAllByTestId(testID)
                .stream()
                .map(question -> new QuestionView(question.getId()
                        ,question.getQuestion(),
                        question.getOptions().
                                stream().
                                map(option -> new OptionView(option.getId(),
                                        option.getOption()))
                                .toList()
                )).toList();
    }

}
