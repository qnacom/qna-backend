package com.techninja.qnabackend.entities;

import jakarta.persistence.*;

import java.time.LocalDateTime;
import java.util.List;

@Entity
@Table(name = "T_ANSWERS")
public class Answer {
    @Id
    @SequenceGenerator(name = "t_answers_id_seq_generator", sequenceName = "t_answers_id_seq", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "t_answers_id_seq_generator")
    private Long id;

    @OneToOne
    @JoinColumn(name = "question_id")
    private Question question;

    private Long optionId;

    private Long userId;

    private LocalDateTime createdTs;

    private LocalDateTime modifiedTs;

    public Question getQuestion() {
        return question;
    }

    public void setQuestion(Question question) {
        this.question = question;
    }

    public Answer() {
    }

    public Answer(Question question,
                  Long optionId,
                  Long userId,
                  LocalDateTime createdTs,
                  LocalDateTime modifiedTs) {
        this.question = question;
        this.optionId = optionId;
        this.userId = userId;
        this.createdTs = createdTs;
        this.modifiedTs = modifiedTs;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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
