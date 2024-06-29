package com.techninja.qnabackend.controllers.request;

public class AssignedTestUpdateRequest {
    private Long userId;
    private  Long state;

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public Long getState() {
        return state;
    }

    public void setState(Long state) {
        this.state = state;
    }
}
