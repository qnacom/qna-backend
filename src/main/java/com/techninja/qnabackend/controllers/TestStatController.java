package com.techninja.qnabackend.controllers;

import com.techninja.qnabackend.controllers.request.TestStatsRequest;
import com.techninja.qnabackend.services.AnswerService;
import com.techninja.qnabackend.services.TestStatService;
import com.techninja.qnabackend.views.TestResultStatView;
import com.techninja.qnabackend.views.TestStatView;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class TestStatController {

    @Autowired
    private TestStatService testStatService;
    @PostMapping("user/test-stat")
    public TestStatView showStat(@RequestBody TestStatsRequest testStatsRequest) {
        return testStatService.getTestStat(testStatsRequest);
    }
    @GetMapping("/result/{userId}")
    public TestResultStatView showResult(@PathVariable Long userId)
    {
        return  testStatService.getResult(userId);
    }

}
