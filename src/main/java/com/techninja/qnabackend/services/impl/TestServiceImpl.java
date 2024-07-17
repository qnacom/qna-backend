package com.techninja.qnabackend.services.impl;
import com.techninja.qnabackend.controllers.request.CreateTestRequest;
import com.techninja.qnabackend.entities.Option;
import com.techninja.qnabackend.entities.Question;
import com.techninja.qnabackend.repositories.OptionRepository;
import com.techninja.qnabackend.repositories.QuestionRepository;
import com.techninja.qnabackend.repositories.TestRepository;
import com.techninja.qnabackend.services.CreateTestService;
import org.springframework.stereotype.Service;
import java.time.LocalDateTime;
import java.util.List;
import java.util.stream.Stream;

import static java.util.stream.Collectors.toList;

@Service
public class TestServiceImpl implements CreateTestService {
    private TestRepository testRepository;
    private QuestionRepository questionRepository;
    private OptionRepository optionRepository;

    public TestServiceImpl(TestRepository testRepository,
                           QuestionRepository questionRepository,
                           OptionRepository optionRepository) {
        this.testRepository = testRepository;
        this.questionRepository = questionRepository;
        this.optionRepository = optionRepository;
    }
    @Override
    public void createTest(CreateTestRequest createTestRequest) {
        Long testId = 2l;
        Long examinerId = 1L;
        createTestRequest.getQuestions().forEach(questionRequest -> {
            Question question = new Question(
                    questionRequest.getQuestion(),
                    LocalDateTime.now(),
                    LocalDateTime.now(),
                    examinerId,
                    examinerId,
                    testId
            );
            questionRepository.save(question);
            questionRequest.getOptions().forEach(optionRequest -> {
                        Option option= new Option(
                                optionRequest.getOption(),
                                LocalDateTime.now(),
                                LocalDateTime.now(),
                                question,
                                examinerId,
                                examinerId,
                                optionRequest.getIsAnswer()
                        );
                      optionRepository.save(option);
                    });
        });

    }
}
