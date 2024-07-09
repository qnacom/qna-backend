package com.techninja.qnabackend.entities;

import jakarta.persistence.*;

import java.time.LocalDateTime;
import java.util.List;

@Entity
@Table(name = "T_QUESTION")
public class Question {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String question;

    private LocalDateTime createdTs;

    private LocalDateTime modifiedTs;

    private Long createdBy;

    private Long modifiedBy;

    private Long testId;

    @OneToMany(mappedBy = "question", cascade = CascadeType.PERSIST)
    private List<Option> options;

    @OneToOne(mappedBy = "question")
    private Answer answer;
    public Question(){}

    public Question(Long id) {
        this.id = id;
    }

    public Question(String question,
                    List<Option> options,
                    LocalDateTime createdTs,
                    LocalDateTime modifiedTs,
                    Long createdBy,
                    Long modifiedBy,
                    Long testId) {
        this.question = question;
        this.options = options;
        this.createdTs = createdTs;
        this.modifiedTs = modifiedTs;
        this.createdBy = createdBy;
        this.modifiedBy = modifiedBy;
        this.testId = testId;
    }

    public Answer getAnswer() {
        return answer;
    }

    public void setAnswer(Answer answer) {
        this.answer = answer;
    }

    public List<Option> getOptions() {
        return options;
    }

    public void setOptions(List<Option> options) {
        this.options = options;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
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

    public Long getTestId() {
        return testId;
    }

    public void setTestId(Long testId) {
        this.testId = testId;
    }
}
