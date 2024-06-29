package com.techninja.qnabackend.services;

import com.techninja.qnabackend.controllers.request.TestStatsRequest;
import com.techninja.qnabackend.views.TestResultStatView;
import com.techninja.qnabackend.views.TestStatView;

public interface TestStatService {
    public TestStatView getTestStat(TestStatsRequest testStatsRequest);
    public TestResultStatView getResult(Long userId);
}
