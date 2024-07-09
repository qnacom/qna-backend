package com.techninja.qnabackend.entities;

import jakarta.persistence.*;

import java.time.LocalDateTime;

@Entity
@Table(name = "T_Option")
public class Option {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String option;

    private LocalDateTime createdTs;

    private LocalDateTime modifiedTs;

    private Long createdBy;

    private Long modifiedBy;

    private Boolean isAnswer;

    @ManyToOne
    @JoinColumn(name = "question_id")
    private Question question;

    public Option(
            String option,
            LocalDateTime createdTs,
            LocalDateTime modifiedTs,
            Long createdBy,
            Long modifiedBy,
            Boolean isAnswer) {
        this.option = option;
        this.createdTs = createdTs;
        this.modifiedTs = modifiedTs;
        this.createdBy = createdBy;
        this.modifiedBy = modifiedBy;
        this.isAnswer = isAnswer;
    }

    public Option(
            String option,
            LocalDateTime createdTs,
            LocalDateTime modifiedTs,
            Question question,
            Long createdBy,
            Long modifiedBy,
            Boolean isAnswer) {
        this.option = option;
        this.createdTs = createdTs;
        this.modifiedTs = modifiedTs;
        this.question=question;
        this.createdBy = createdBy;
        this.modifiedBy = modifiedBy;
        this.isAnswer = isAnswer;
    }

    public Question getQuestion() {
        return question;
    }

    public void setQuestion(Question question) {
        this.question = question;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getOption() {
        return option;
    }

    public void setOption(String option) {
        this.option = option;
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

    public Boolean getIsAnswer() {
        return isAnswer;
    }

    public void setIsAnswer(Boolean answer) {
        isAnswer = answer;
    }
}
