package com.techninja.qnabackend.views;

import java.util.List;

public class OptionView {
    private Long id;
    private String option;

    public OptionView(Long id, String option) {
        this.id = id;
        this.option = option;
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
}
