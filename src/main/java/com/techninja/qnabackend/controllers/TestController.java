package com.techninja.qnabackend.controllers;

import com.techninja.qnabackend.services.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController

public class TestController {

        @Autowired
        private TestService testService;

        public TestController(TestService testService) {
            this.testService = testService;
        }
        @GetMapping("/{testId}/questions")
        public ResponseEntity<List<Object[]>> getQuestionsAndTestNameByTestId(@PathVariable Long testId) {
            List<Object[]> result = testService.findQuestionsAndTestNameByTestId(testId);
            return ResponseEntity.ok(result);
        }
    }

