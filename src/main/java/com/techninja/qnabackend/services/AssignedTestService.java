package com.techninja.qnabackend.services;

import com.techninja.qnabackend.controllers.request.AssignedRequest;
import com.techninja.qnabackend.views.UserView;

import java.util.List;

public interface AssignedTestService {
    List<UserView> getAllAssignedTests(Long userId);
    void changeState(AssignedRequest assignedRequest, Long testId);


}
