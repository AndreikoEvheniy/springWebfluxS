package com.andreiko.listStudents.service;

import com.andreiko.listStudents.dao.StudentRepository;
import com.andreiko.listStudents.model.Student;
import org.springframework.stereotype.Service;

import reactor.core.publisher.Flux;

@Service
public class StudentServiceImpl implements StudentService {

    private final StudentRepository studentRepository;

    public StudentServiceImpl(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    public void create(Student student) {
        studentRepository.save(student).subscribe();
    }

    public Flux<Student> findAll() {
        return studentRepository.findAll();
    }

}