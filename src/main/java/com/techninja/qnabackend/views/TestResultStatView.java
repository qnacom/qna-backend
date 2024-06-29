package com.techninja.qnabackend.views;

public class TestResultStatView {
    private  Long correct;
    private Long wrong;
    private Long result;

    public TestResultStatView(Long correct, Long wrong, Long result) {
        this.correct = correct;
        this.wrong = wrong;
        this.result = result;
    }

    public Long getCorrect() {
        return correct;
    }

    public void setCorrect(Long correct) {
        this.correct = correct;
    }

    public Long getWrong() {
        return wrong;
    }

    public void setWrong(Long wrong) {
        this.wrong = wrong;
    }

    public Long getResult() {
        return result;
    }

    public void setResult(Long result) {
        this.result = result;
    }

    @Override
    public String toString() {
        return "TestResultStatView{" +
                "correct=" + correct +
                ", wrong=" + wrong +
                ", result=" + result +
                '}';
    }
}
