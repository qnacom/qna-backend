package com.techninja.qnabackend.views;

public class TestView {
    private Long id;
    private String test;
    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public String getTest() {
        return test;
    }
    public void setTest(String test) {
        this.test = test;
    }
    public TestView(Long id, String test) {
        this.id = id;
        this.test = test;
    }
}
