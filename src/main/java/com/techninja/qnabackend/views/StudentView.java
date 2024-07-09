package com.techninja.qnabackend.views;

import java.util.List;

public class StudentView {
    private String studentName;
    private List<QuestionView> questionViews;

    public StudentView(String studentName, List<QuestionView> questionViews) {
        this.studentName = studentName;
        this.questionViews = questionViews;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public List<QuestionView> getQuestionViews() {
        return questionViews;
    }

    public void setQuestionViews(List<QuestionView> questionViews) {
        this.questionViews = questionViews;
    }

    @Override
    public String toString() {
        return "StudentView{" +
                "studentName='" + studentName + '\'' +
                ", questionViews=" + questionViews +
                '}';
    }
}
