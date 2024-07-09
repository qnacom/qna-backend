package com.techninja.qnabackend.controllers.request;

import java.util.List;

public class CreateTestRequest {

    private Long examinerId;
    private String name;
    List<QuestionRequest> questions;

    public Long getExaminerId() {
        return examinerId;
    }

    public String getName() {
        return name;
    }

    public List<QuestionRequest> getQuestions() {
        return questions;
    }
}
