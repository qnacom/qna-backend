package com.techninja.qnabackend.services;

import com.techninja.qnabackend.controllers.request.AssignedTestUpdateRequest;
import com.techninja.qnabackend.views.TestView;

import java.util.List;

public interface AssignedTestService {
    List<TestView> getAllAssignedTests(Long userId);
   void changeState(AssignedTestUpdateRequest assignedRequest, Long testId);
}
