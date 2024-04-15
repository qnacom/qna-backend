package com.techninja.qnabackend.entities;

import jakarta.persistence.*;

import java.time.LocalDateTime;

@Entity
@Table(name = "T_ANSWERS")
public class Answer {
    @Id
    private Long id;

    private Long questionId;
    private Long optionId;
    private Long userId;
    private LocalDateTime createdTs;
    private LocalDateTime modifiedTs;

    public Answer() {
    }

    public Answer(Long id, Long questionId, Long optionId, Long userId, LocalDateTime createdTs, LocalDateTime modifiedTs) {
        this.id = id;
        this.questionId = questionId;
        this.optionId = optionId;
        this.userId=userId;
        this.createdTs = createdTs;
        this.modifiedTs = modifiedTs;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getQuestionId() {
        return questionId;
    }

    public void setQuestionId(Long questionId) {
        this.questionId = questionId;
    }

    public Long getOptionId() {
        return optionId;
    }

    public void setOptionId(Long optionId) {
        this.optionId = optionId;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
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
}
