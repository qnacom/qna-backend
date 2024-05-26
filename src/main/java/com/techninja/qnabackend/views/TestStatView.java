package com.techninja.qnabackend.views;

public class TestStatView {
    private Integer solvedQuestions;
    private Integer unSolvedQuestions;
    private Integer total;

    public TestStatView(Integer solvedQuestions, Integer unSolvedQuestions, Integer total) {
        this.solvedQuestions = solvedQuestions;
        this.unSolvedQuestions = unSolvedQuestions;
        this.total = total;
    }

    public Integer getSolvedQuestions() {
        return solvedQuestions;
    }

    public void setSolvedQuestions(Integer solvedQuestions) {
        this.solvedQuestions = solvedQuestions;
    }

    public Integer getUnSolvedQuestions() {
        return unSolvedQuestions;
    }

    public void setUnSolvedQuestions(Integer unSolvedQuestions) {
        this.unSolvedQuestions = unSolvedQuestions;
    }

    public Integer getTotal() {
        return total;
    }

    public void setTotal(Integer total) {
        this.total = total;
    }
}
