package com.example.demo.controller;
import com.example.demo.model.Student;
import com.example.demo.service.StudentService;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/api/students")
public class StudentController {
    private final StudentService studentService;

    public StudentController(StudentService service) {
        this.studentService = service;
    }

    @GetMapping
    public List<Student> getAllStudents() {
        return studentService.getAllStudents();
    }

    @PostMapping
    public Student addStudent(@RequestBody Student student) {
        return studentService.addStudent(student);
    }

    @DeleteMapping("/{id}")
    public String deleteStudent(@PathVariable Long id) {
        return studentService.deleteStudent(id) ? "Deleted" : "Not Found";
    }
    
}
