package com.andreiko.listStudents.service;

import com.andreiko.listStudents.model.Student;
import reactor.core.publisher.Flux;

public interface StudentService {
    void create(Student e);

    Flux<Student> findAll();
}
