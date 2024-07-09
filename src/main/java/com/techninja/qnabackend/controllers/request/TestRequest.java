package com.techninja.qnabackend.controllers.request;

import java.util.List;

public class TestRequest {
    private Long examinerId;
    private List<StudentRequest> students;

    public Long getExaminerId() {
        return examinerId;
    }

    public List<StudentRequest> getStudents() {
        return students;
    }
}
