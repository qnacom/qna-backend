package com.techninja.qnabackend.services.impl;

import com.techninja.qnabackend.controllers.request.TestStatsRequest;
import com.techninja.qnabackend.entities.Answer;
import com.techninja.qnabackend.entities.Option;
import com.techninja.qnabackend.repositories.AnswerRepository;
import com.techninja.qnabackend.repositories.OptionRepository;
import com.techninja.qnabackend.repositories.QuestionRepository;
import com.techninja.qnabackend.services.TestStatService;
import com.techninja.qnabackend.views.TestResultStatView;
import com.techninja.qnabackend.views.TestStatView;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

@Service
public class TestStatServiceImpl implements TestStatService {
    private AnswerRepository answerRepository;
    private QuestionRepository questionRepository;
    private OptionRepository optionRepository;

    public TestStatServiceImpl(AnswerRepository answerRepository, QuestionRepository questionRepository, OptionRepository optionRepository) {
        this.answerRepository = answerRepository;
        this.questionRepository = questionRepository;
        this.optionRepository = optionRepository;
    }

    @Override
    public TestStatView getTestStat(TestStatsRequest testStatsRequest) {
        List<Answer> answers = answerRepository.findAllByUserId(testStatsRequest.getUserId());
        Integer solved = answers.size();
        Integer total = questionRepository.findAllByTestId(testStatsRequest.getTestId()).size();
        Integer unsolved = total - solved;
        return new TestStatView(solved, unsolved, total);
    }

    @Override
    public TestResultStatView getResult(Long userId) {
        Long correct = 0l;
        Long wrong = 0l;
        Long result = 0l;
        List<Answer> answers = answerRepository.findAllByUserId(userId);
        List<Long> questionId = answers
                .stream()
                .map(q -> q.getQuestion().getId())
                .distinct()
                .toList();
        List<Option> questionOption = optionRepository.findAllByQuestionIdIn(questionId);
        Map<Long, List<Option>> optionByQuestionId = questionOption
                .stream()
                .collect(Collectors.groupingBy(option -> option.getQuestion().getId()));
        System.out.println(optionByQuestionId);
        correct = answers.stream()
                .filter(answer -> {
                    List<Option> options = optionByQuestionId.get(answer.getQuestion().getId());
                    if (options != null) {
                        return options
                                .stream()
                                .anyMatch(option -> option.getId().equals(answer.getOptionId()) && option.getIsAnswer());
                    } else {
                        return false;
                    }
                }).count();
        result = correct;
        return new TestResultStatView(correct, answers.size()-correct, result);
    }
}
