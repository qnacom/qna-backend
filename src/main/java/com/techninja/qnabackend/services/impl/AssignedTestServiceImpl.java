package com.techninja.qnabackend.services.impl;

import com.techninja.qnabackend.controllers.request.AssignedTestUpdateRequest;
import com.techninja.qnabackend.entities.AssignedTest;
import com.techninja.qnabackend.repositories.AssignedTestRepository;
import com.techninja.qnabackend.repositories.TestRepository;
import com.techninja.qnabackend.services.AssignedTestService;
import com.techninja.qnabackend.views.TestView;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AssignedTestServiceImpl implements AssignedTestService {

    @Autowired
    private TestRepository testRepository;
    @Autowired
    private AssignedTestRepository assignedTestRepository;


    @Override
    public List<TestView> getAllAssignedTests(Long userId) {

        return assignedTestRepository.findAllByUserId(userId)
                .stream()
                .map(assignedTest -> new TestView(
                        assignedTest.getTest().getId(),
                        assignedTest.getTest().getName()
                )).toList();
    }

    @Override
    public void changeState(AssignedTestUpdateRequest assignedRequest, Long testId) {
        AssignedTest assignedTest = assignedTestRepository.findByUserIdAndTestId(
                assignedRequest.getUserId(), testId
        );
        assignedTest.setState(assignedRequest.getState());
        assignedTestRepository.save(assignedTest);
    }
}


