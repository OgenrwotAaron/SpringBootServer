package com.example.hibernatedemo.student;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRespositiry extends JpaRepository<Student, Long> {

}
