package com.techninja.qnabackend.services.impl;

import com.techninja.qnabackend.repositories.TestRepository;
import com.techninja.qnabackend.services.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class TestSerivceImpl implements TestService {
     @Autowired
    private TestRepository testRepository;

    public TestSerivceImpl(TestRepository testRepository) {
        this.testRepository = testRepository;
    }
}
