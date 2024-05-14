package com.techninja.qnabackend.controllers;

import com.techninja.qnabackend.controllers.request.AssignedRequest;
import com.techninja.qnabackend.controllers.request.TestStatsRequest;
import com.techninja.qnabackend.services.AnswerService;
import com.techninja.qnabackend.services.AssignedTestService;
import com.techninja.qnabackend.views.TestStatView;
import com.techninja.qnabackend.views.UserView;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class AssignedTestController {
    @Autowired
    private AssignedTestService assignedTestService;
    @Autowired
    private AnswerService answerService;

    @GetMapping("/{userId}/tests")
    public List<UserView> getAllTests(@PathVariable Long userId) {
        return assignedTestService.getAllAssignedTests(userId);
    }

    @PutMapping("/tests/assigned-tests/{testId}")
    public void updateState(@RequestBody AssignedRequest assignedRequest, @PathVariable Long testId) {
        assignedTestService.changeState(assignedRequest, testId);
    }

    /**
     * TODO: In this api, serve only stats - solved, unsolved and total questions. Create another api for result.
     */
  /*  @PostMapping("/test-stats/")
    public ResponseEntity<TestStatView> solvedQuestion(@RequestBody TestStatsRequest testStatsRequest) {
        TestStatView list = answerService.getTestsStats(testStatsRequest);
        return new ResponseEntity<>(list, HttpStatus.CREATED);
    }*/

}
