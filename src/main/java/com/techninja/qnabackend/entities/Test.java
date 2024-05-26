package com.techninja.qnabackend.entities;

import jakarta.persistence.*;

import java.time.LocalDateTime;
import java.util.List;

@Entity
@Table(name="T_TEST")
public class Test {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    private LocalDateTime createdTs;

    private LocalDateTime modifiedTs;

    private Long createdBy;
    
    private Long modifiedBy;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String testName) {
        this.name = name;
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

    public Long getCreate_By() {
        return createdBy;
    }

    public void setCreate_By(Long create_By) {
        this.createdBy = createdBy;
    }

    public Long getModifies_By() {
        return modifiedBy;
    }

    public void setModifies_By(Long modifies_By) {
        this.modifiedBy = modifiedBy;
    }
}
