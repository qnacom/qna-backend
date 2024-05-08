package com.techninja.qnabackend.views;

import java.util.List;

public class UserView {
    private Long id;
    private List<TestView> tests;
    private String firstName;

    public UserView(String firstName) {
        this.firstName = firstName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public UserView(Long id, List<TestView> tests) {
        this.id = id;
        this.tests = tests;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public List<TestView> getTests() {
        return tests;
    }

    public void setTests(List<TestView> tests) {
        this.tests = tests;
    }
}
