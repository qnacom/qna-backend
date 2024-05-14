package com.techninja.qnabackend.services.impl;

import com.techninja.qnabackend.entities.Question;
import com.techninja.qnabackend.repositories.OptionRepository;
import com.techninja.qnabackend.repositories.QuestionRepository;
import com.techninja.qnabackend.services.QuestionService;
import com.techninja.qnabackend.views.OptionView;
import com.techninja.qnabackend.views.QuestionView;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class QuestionServiceImpl implements QuestionService {

    @Autowired
    private QuestionRepository questionRepository;

    @Autowired
    private OptionRepository optionRepository;

    @Override
    public List<QuestionView> allQuestion(Long testID) {

        return questionRepository.findAllByTestId(testID)
                .stream()
                .map(question -> new QuestionView(question.getId()
                        ,question.getQuestion(),
                        question.getOptionList().
                                stream().
                                map(option -> new OptionView(option.getId(),
                                        option.getOption()))
                                .toList()
                )).toList();

    }

    @Override
    public List<QuestionView> getAllQuestionsOf(Long testId) {

        /**
         * TODO: We are calling two method here. One on questionRepository and one on optionRepository.
         * Call only one method on questionRepository.
         */
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

    @Override
    public List<QuestionView> allQuestionByTestId(Long testId) {
        List<QuestionView> questionViews = questionRepository.findQuestion(testId)
                .stream()
                .map(q-> new QuestionView(q.getId() ,q.getQuestion()))
                .toList();
        return questionViews;
    }
}
