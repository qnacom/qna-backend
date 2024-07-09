package com.techninja.qnabackend.services;

import com.techninja.qnabackend.controllers.request.TestRequest;
import com.techninja.qnabackend.views.DisplayTestView;

public interface DisplayTestService {
    DisplayTestView getTest(TestRequest testRequest);
}
