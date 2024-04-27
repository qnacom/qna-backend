package com.techninja.qnabackend.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import java.time.LocalDateTime;

@Entity
@Table(name = "T_ASSIGNED_TEST")
public class AssignedTest {
    @Id
    private Long id;

    private Long userId;

    private Long testId;

    private LocalDateTime createdTs;

    private LocalDateTime modifiedTs;

    private Long createdBy;

    private Long modifiedBy;
    private String state;

    public String getState() {
        return state;
    }
    public void setState(String state) {
        this.state = state;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public LocalDateTime getCreatedTs() {
        return createdTs;
    }

    public void setCreatedTs(LocalDateTime createdTs) {
        this.createdTs = createdTs;
    }

    public LocalDateTime getModifiedTs() {
        return modifiedTs;
    }

    public void setModifiedTs(LocalDateTime modifiedTs) {
        this.modifiedTs = modifiedTs;
    }

    public Long getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(Long createdBy) {
        this.createdBy = createdBy;
    }

    public Long getModifiedBy() {
        return modifiedBy;
    }

    public void setModifiedBy(Long modifiedBy) {
        this.modifiedBy = modifiedBy;
    }

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

    public AssignedTest(Long userId, String state) {
        this.userId = userId;
        this.state = state;
    }

    public AssignedTest(Long userId, Long testId) {
        this.userId = userId;
        this.testId = testId;
    }

    public AssignedTest() {
    }
}
