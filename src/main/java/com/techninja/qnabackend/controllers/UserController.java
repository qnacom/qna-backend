package com.techninja.qnabackend.controllers;

import com.techninja.qnabackend.services.UserService;
import com.techninja.qnabackend.views.UserView;
import liquibase.license.LicenseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserController {

    @Autowired
    public UserService userService;

    @GetMapping("/users/{lastName}")
    public ResponseEntity<List<UserView>> getUsersByLastName(@PathVariable String lastName)
    {
        return  new ResponseEntity<> (
                userService.getAllUserName(lastName),
                HttpStatus.OK);
    }

}
