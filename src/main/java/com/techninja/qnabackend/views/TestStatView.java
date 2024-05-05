package com.techninja.qnabackend.views;

public class TestStatView {
    private Integer solvedQuestions;
    private Integer unSolvedQuestions;
    private Integer total;
    private Integer correctAnswers;
    private Integer wrongAnswers;
    private Integer result;

    public Integer getTotal() {
        return total;
    }

    public void setTotal(Integer total) {
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

    public Integer getCorrectAnswers() {
        return correctAnswers;
    }

    public void setCorrectAnswers(Integer correctAnswers) {
        this.correctAnswers = correctAnswers;
    }

    public Integer getWrongAnswers() {
        return wrongAnswers;
    }

    public void setWrongAnswers(Integer wrongAnswers) {
        this.wrongAnswers = wrongAnswers;
    }

    public Integer getResult() {
        return result;
    }

    public void setResult(Integer result) {
        this.result = result;
    }

    public TestStatView(Integer solvedQuestions,
                        Integer unSolvedQuestions,
                        Integer total,
                        Integer correctAnswers,
                        Integer wrongAnswers,
                        Integer result) {
        this.solvedQuestions = solvedQuestions;
        this.unSolvedQuestions = unSolvedQuestions;
        this.total = total;
        this.correctAnswers = correctAnswers;
        this.wrongAnswers = wrongAnswers;
        this.result = result;
    }
}
