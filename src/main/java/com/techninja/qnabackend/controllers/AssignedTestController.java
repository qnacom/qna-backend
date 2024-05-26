package com.techninja.qnabackend.controllers;

import com.techninja.qnabackend.controllers.request.AssignedTestUpdateRequest;
import com.techninja.qnabackend.services.AnswerService;
import com.techninja.qnabackend.services.AssignedTestService;
import com.techninja.qnabackend.views.TestView;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class AssignedTestController {
    @Autowired
    private AssignedTestService assignedTestService;

    @Autowired
    private AnswerService answerService;

    @GetMapping("/{userId}/tests")
    public List<TestView> getAllTests(@PathVariable Long userId) {
        return assignedTestService.getAllAssignedTests(userId);
    }

    @PutMapping("/tests/assigned-tests/{testId}")
    public void updateState(@RequestBody AssignedTestUpdateRequest assignedRequest, @PathVariable Long testId) {
        assignedTestService.changeState(assignedRequest, testId);
    }
}
