package com.techninja.qnabackend.controllers.request;

public class TestStatsRequest {
    private Long userId;
    private Long testId;

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public Long getTestId() {
        return testId;
    }

    public void setTestId(Long testId) {
        this.testId = testId;
    }
}
