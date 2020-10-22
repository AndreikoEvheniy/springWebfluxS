package com.andreiko.listStudents.dao;

import com.andreiko.listStudents.model.Student;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;

import reactor.core.publisher.Flux;
 
public interface StudentRepository extends ReactiveMongoRepository<Student, Integer> {
    @Query("{ 'name': ?0 }")
    Flux<Student> findByName(final String name);
}