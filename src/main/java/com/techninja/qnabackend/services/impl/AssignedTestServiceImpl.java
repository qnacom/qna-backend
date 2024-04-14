package com.techninja.qnabackend.services.impl;

import com.techninja.qnabackend.entities.AssignedTest;
import com.techninja.qnabackend.repositories.AssignedTestRepository;
import com.techninja.qnabackend.repositories.TestRepository;
import com.techninja.qnabackend.services.AssignedTestService;
import com.techninja.qnabackend.views.TestView;
import com.techninja.qnabackend.views.UserView;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class AssignedTestServiceImpl implements AssignedTestService {

    @Autowired
    private TestRepository testRepository;

    @Autowired
    private AssignedTestRepository assignedTestRepository;

    @Override
    public List<UserView> getAllAssignedTests(Long userId) {
        // Retrieve assigned tests for the given user
        List<Long> assignedTestIds = assignedTestRepository.findAllByUserId(userId)
                .stream()
                .map(AssignedTest::getTestId)
                .toList();

        // Map assigned test IDs to TestView objects
        List<TestView> assignedTests = testRepository.findAllByIdIn(assignedTestIds)
                .stream()
                .map(test -> new TestView(test.getId(), test.getName()))
                .collect(Collectors.toList());

        // Create a UserView object containing the assigned tests
        return List.of(new UserView(userId, assignedTests));
    }
}

