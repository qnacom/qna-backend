package com.techninja.qnabackend.services.impl;

import com.techninja.qnabackend.controllers.request.AnswerRequest;
import com.techninja.qnabackend.controllers.request.TestStatsRequest;
import com.techninja.qnabackend.entities.Answer;
import com.techninja.qnabackend.entities.Question;
import com.techninja.qnabackend.repositories.AnswerRepository;
import com.techninja.qnabackend.repositories.OptionRepository;
import com.techninja.qnabackend.repositories.QuestionRepository;
import com.techninja.qnabackend.services.AnswerService;
import com.techninja.qnabackend.views.TestStatView;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

@Service
public class AnswerServiceImpl implements AnswerService {

    private final AnswerRepository answerRepository;
    private QuestionRepository questionRepository;

    public AnswerServiceImpl(AnswerRepository answerRepository, QuestionRepository questionRepository, OptionRepository optionRepository) {
        this.answerRepository = answerRepository;
        this.questionRepository = questionRepository;
    }

    @Override
    public void saveAnswer(Long testId, Long questionId, AnswerRequest answerRequest) {
        Answer answer = new Answer(new Question(questionId),
                answerRequest.getOptionId(),
                answerRequest.getUserId(),
                LocalDateTime.now(),
                LocalDateTime.now()
        );

        answerRepository.save(answer);
    }

    @Override
    public TestStatView getTestStat(TestStatsRequest testStatsRequest) {
        List<Answer> answers = answerRepository.findAllByUserId(testStatsRequest.getUserId());
        Integer solved = answers.size();
        Integer total = questionRepository.findAllByTestId(testStatsRequest.getTestId()).size();
        Integer unsolved = total - solved;
        return new TestStatView(solved, unsolved, total);
    }
}


