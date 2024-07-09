package com.techninja.qnabackend.controllers;

import com.techninja.qnabackend.controllers.request.TestRequest;
import com.techninja.qnabackend.services.DisplayTestService;
import com.techninja.qnabackend.views.DisplayTestView;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DisplayTestController {

    @Autowired
    private DisplayTestService displayTestService;

    @PostMapping("/test")
    public DisplayTestView displayTestView(@RequestBody TestRequest testRequest) {
        return displayTestService.getTest(testRequest);
    }
}
