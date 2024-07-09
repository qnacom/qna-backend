package com.techninja.qnabackend.controllers.request;

import java.util.List;

public class QuestionRequest {

    private String question;

    List<OptionRequest> options;

    public String getQuestion() {
        return question;
    }

    public List<OptionRequest> getOptions() {
        return options;
    }
}
