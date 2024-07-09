package com.techninja.qnabackend.services.impl;
import com.techninja.qnabackend.controllers.request.TestRequest;
import com.techninja.qnabackend.repositories.UserRepository;
import com.techninja.qnabackend.services.DisplayTestService;
import com.techninja.qnabackend.services.QuestionService;
import com.techninja.qnabackend.views.DisplayTestView;
import com.techninja.qnabackend.views.QuestionView;
import com.techninja.qnabackend.views.StudentView;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class DisplayTestServiceImpl implements DisplayTestService {
    private UserRepository userRepository;
    private QuestionService questionService;

    public DisplayTestServiceImpl(UserRepository userRepository, QuestionService questionService) {
        this.userRepository = userRepository;
        this.questionService = questionService;
    }
    @Override
    public DisplayTestView getTest(TestRequest testRequest) {
        String name=userRepository.findById(testRequest.getExaminerId()).get().getFirstName();
        List<StudentView> studentViews=testRequest.getStudents()
                .stream()
                .map(student -> {
                    String studentName=userRepository.findById(student.getUserId()).get().getFirstName();
                    List<QuestionView> questionViews=questionService.getAllQuestionsOf(student.getTestId());
                    return new StudentView(studentName,questionViews);
                }).toList();
        return new DisplayTestView(name,studentViews);
    }
}
