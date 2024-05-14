package com.techninja.qnabackend.services.impl;

import com.techninja.qnabackend.controllers.request.AnswerRequest;
import com.techninja.qnabackend.controllers.request.TestStatsRequest;
import com.techninja.qnabackend.entities.Answer;
import com.techninja.qnabackend.entities.Option;
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
    private OptionRepository optionRepository;

    public AnswerServiceImpl(AnswerRepository answerRepository, QuestionRepository questionRepository, OptionRepository optionRepository) {
        this.answerRepository = answerRepository;
        this.questionRepository = questionRepository;
        this.optionRepository = optionRepository;
    }

    @Override
    public void saveAnswer(Long testId, Long questionId, AnswerRequest answerRequest) {
        Answer answer = new Answer(questionId,
                answerRequest.getOptionId(),
                answerRequest.getUserId(),
                LocalDateTime.now(),
                LocalDateTime.now()
        );

        answerRepository.save(answer);
    }


  /*  @Override
    public TestStatView getTestsStats(TestStatsRequest testStatsRequest) {
        List<Question> questions = questionRepository.findAllByTestId(testStatsRequest.getTestId());

        /**
         * TODO: Load only answers for a particular test. You are loading all answers of that user
         * */
     //   List<Answer> answers = answerRepository.findAllByUserId(testStatsRequest.getUserId());

        /**
         * TODO: Load only correct options of all questions of that test only. You are loading all options
         */
      /*  List<Option> options = optionRepository.findAll();
        Integer count = 0;

        for (Answer a : answers) {
            for (Option o : options) {
                if (a.getQuestionId().equals(o.getQuestionId())) {
                    if (a.getOptionId().equals(o.getId())) {
                        if (o.getAnswer()) {
                            count++;
                        }
                    }
                }
            }

        }
        return new TestStatView(answers.size(),
                questions.size() - answers.size(),
                questions.size(),
                count,
                questions.size() - count,
                count);
    }*/
}


