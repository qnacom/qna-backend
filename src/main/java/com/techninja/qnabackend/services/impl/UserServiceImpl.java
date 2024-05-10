package com.techninja.qnabackend.services.impl;

import com.techninja.qnabackend.repositories.UserRepository;
import com.techninja.qnabackend.services.UserService;
import com.techninja.qnabackend.views.UserView;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserRepository userRepository;

    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public List<UserView> getAllUserName(String lastName) {
        List<UserView> userViews=userRepository.findAllLastName(lastName)
                .stream()
                .map(u-> new UserView(u.getFirstName()))
                .toList();
        return userViews;
    }
}