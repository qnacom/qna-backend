package com.techninja.qnabackend.services;

import com.techninja.qnabackend.views.UserView;

import java.util.List;

public interface UserService {
    List<UserView> getAllUserName(String lastName);
}
