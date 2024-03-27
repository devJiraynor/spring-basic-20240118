package com.jihoon.basic.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/studnet")
public class StudentController {

    @PostMapping("/")
    public ResponseEntity<?> postStudent() {
        return null;
    }
    
}
