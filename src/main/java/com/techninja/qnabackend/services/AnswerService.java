package com.techninja.qnabackend.services;

import com.techninja.qnabackend.controllers.request.AnswerRequest;
import com.techninja.qnabackend.controllers.request.TestStatsRequest;
import com.techninja.qnabackend.views.TestStatView;

public interface AnswerService {
    void saveAnswer(Long testId, Long questionId, AnswerRequest answerRequest);

    TestStatView getTestsStats(TestStatsRequest testStatsRequest);
}
