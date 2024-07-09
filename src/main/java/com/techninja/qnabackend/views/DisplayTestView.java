package com.techninja.qnabackend.views;

import java.util.List;

public class DisplayTestView {
   private String examinerName;
   private List<StudentView> studentViews;

    public DisplayTestView(String examinerName, List<StudentView> studentViews) {
        this.examinerName = examinerName;
        this.studentViews = studentViews;
    }
    public String getExaminerName() {
        return examinerName;
    }

    public void setExaminerName(String examinerName) {
        this.examinerName = examinerName;
    }

    public List<StudentView> getStudentViews() {
        return studentViews;
    }

    public void setStudentViews(List<StudentView> studentViews) {
        this.studentViews = studentViews;
    }
}
