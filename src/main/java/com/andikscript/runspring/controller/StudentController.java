package com.andikscript.runspring.controller;

import com.andikscript.runspring.service.StudentService;
import org.springframework.stereotype.Controller;

@Controller
public class StudentController {

    private final StudentService studentService;

    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }

    public void getAllStudent() {
        System.out.println(studentService.getAllStudent());
    }
}
