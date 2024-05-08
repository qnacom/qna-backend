package com.techninja.qnabackend.services;

import java.util.List;

public interface TestService {
    public List<Object[]> findQuestionsAndTestNameByTestId(Long testId);
}
