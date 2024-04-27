package com.techninja.qnabackend.controllers;

import com.techninja.qnabackend.controllers.request.AssignedRequest;
import com.techninja.qnabackend.services.AssignedTestService;
import com.techninja.qnabackend.views.UserView;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class AssignedTestController {
    @Autowired
    private AssignedTestService assignedTestService;

    @GetMapping("/{userId}/tests")
    public List<UserView> getAllTests(@PathVariable Long userId) {
        return assignedTestService.getAllAssignedTests(userId);
    }

    @PutMapping("/tests/assigned-tests/{testId}")
    public void updateState(@RequestBody AssignedRequest assignedRequest, @PathVariable Long testId) {
        assignedTestService.changeState(assignedRequest, testId);
    }
}
