package com.techninja.qnabackend.controllers.request;

public class AssignedRequest {
    private Long userId;
    private  String state;

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }
}
