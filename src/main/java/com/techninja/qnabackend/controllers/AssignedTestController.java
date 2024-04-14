package com.techninja.qnabackend.controllers;

import com.techninja.qnabackend.services.AssignedTestService;
import com.techninja.qnabackend.views.UserView;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class AssignedTestController {
    @Autowired
    private AssignedTestService assignedTestService;

    @GetMapping("/{userId}/tests")
    public List<UserView> getAllTests(@PathVariable Long userId) {
        return assignedTestService.getAllAssignedTests(userId);
    }
}
