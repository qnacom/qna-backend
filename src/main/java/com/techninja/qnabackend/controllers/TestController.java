package com.techninja.qnabackend.controllers;

import com.techninja.qnabackend.controllers.request.CreateTestRequest;
import com.techninja.qnabackend.services.CreateTestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @Autowired
    private CreateTestService createTestService;

    @PostMapping("/create-test")
    public void createTest(@RequestBody CreateTestRequest createTestRequest)
    {
        createTestService.createTest(createTestRequest);
    }
}
