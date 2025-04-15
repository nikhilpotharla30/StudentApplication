package com.example.demo.service;

import com.example.demo.model.Student;
import java.util.*;

import org.springframework.stereotype.Service;
@Service
public class StudentService {
    private Map<Long, Student> students = new HashMap<>();
    private Long idCounter = 1L;

    public List<Student> getAllStudents() {
        return new ArrayList<>(students.values());
    }

    public Student addStudent(Student student) {
        student.setId(idCounter++);
        students.put(student.getId(), student);
        return student;
    }

    public boolean deleteStudent(Long id) {
        return students.remove(id) != null;
    }
    
}
