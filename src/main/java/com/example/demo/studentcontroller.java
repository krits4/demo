package com.example.demo;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class studentcontroller {

    @Autowired
    private StudentRepository studentRepository;

    @GetMapping("/student")
    public student getStudent() {
        return new student(1, "John Doe", "Computer Science");
    }

    @PostMapping("/student")
    public student createStudent(@RequestBody student student) {
        return studentRepository.save(student);
    }

    @GetMapping("/students")
    public List<student> getStudents() {
        return studentRepository.findAll();
    }

    @GetMapping("/student/{id}")
    public student getStudentById(@PathVariable int id) {
        Optional<student> student = studentRepository.findById(id);
        return student.orElse(null); // Or you can throw an exception if the student is not found
    }
}
