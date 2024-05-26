package com.techninja.qnabackend.controllers;

import com.techninja.qnabackend.controllers.request.TestStatsRequest;
import com.techninja.qnabackend.services.AnswerService;
import com.techninja.qnabackend.views.TestStatView;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestStatController {
    @Autowired
    private AnswerService answerService;

    @PostMapping("user/test-stat")
    public TestStatView showStat(@RequestBody TestStatsRequest testStatsRequest) {
        return answerService.getTestStat(testStatsRequest);
    }
}
