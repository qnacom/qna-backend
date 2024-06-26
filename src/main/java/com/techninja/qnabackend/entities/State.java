package com.techninja.qnabackend.entities;

import jakarta.persistence.*;

@Entity
@Table(name = "T_STATES")
public class State {
   @Id
   @GeneratedValue(strategy = GenerationType.IDENTITY)
   private Long id;

   private String state;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    @Override
    public String toString() {
        return "State{" +
                "id=" + id +
                ", state='" + state + '\'' +
                '}';
    }
}
