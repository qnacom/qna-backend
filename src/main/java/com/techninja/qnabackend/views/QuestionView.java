package com.techninja.qnabackend.views;

import java.util.List;

public class QuestionView {
    private Long id;
    private String question;
    private List<OptionView> options;

    public QuestionView(Long id, String question, List<OptionView> options) {
        this.id = id;
        this.question = question;
        this.options = options;
    }
    public QuestionView(Long id,String question)
    {
        this.id=id;
        this.question=question;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public List<OptionView> getOptions() {
        return options;
    }

    public void setOptions(List<OptionView> options) {
        this.options = options;
    }
}
