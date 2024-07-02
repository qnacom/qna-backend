package com.techninja.qnabackend.services.impl;

import com.techninja.qnabackend.controllers.request.TestStatsRequest;
import com.techninja.qnabackend.entities.Answer;
import com.techninja.qnabackend.entities.Option;
import com.techninja.qnabackend.entities.Question;
import com.techninja.qnabackend.repositories.AnswerRepository;
import com.techninja.qnabackend.repositories.OptionRepository;
import com.techninja.qnabackend.repositories.QuestionRepository;
import com.techninja.qnabackend.services.TestStatService;
import com.techninja.qnabackend.views.TestResultStatView;
import com.techninja.qnabackend.views.TestStatView;
import org.springframework.stereotype.Service;

import java.util.List;
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
        for (Answer answer : answers) {
            for (Option option : questionOption) {
                if (answer.getQuestion().getId().equals(option.getQuestion().getId()) &&
                        answer.getOptionId().equals(option.getId())) {
                    if (option.getAnswer()) {
                        correct++;
                    } else {
                        wrong++;
                    }
                }
            }
        }
        System.out.println("Coreect answer:-"+correct);
        result = correct;
        return new TestResultStatView(correct, wrong, result);
    }
}
