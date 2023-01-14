package com.example.hibernatedemo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.hibernatedemo.student.Student;
import com.example.hibernatedemo.student.StudentRespositiry;

@SpringBootApplication
public class HibernatedemoApplication implements CommandLineRunner {
	private final Logger logger = LoggerFactory.getLogger(this.getClass());

	@Autowired
	StudentRespositiry respositiry;

	public static void main(String[] args) {
		SpringApplication.run(HibernatedemoApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		logger.info("Student id 10001 -> {}", respositiry.findById(10001L));

		logger.info("All users 1 -> {}", respositiry.findAll());

		// Insert
		logger.info("Inserting -> {}", respositiry.save(new Student("John", "A1234567")));

		// Update
		logger.info("Update 10001 -> {}", respositiry.save(new Student(10001L, "Name-Updated", "New-Passport")));

		// respositiry.deleteById(10002L);

		logger.info("All users 2 -> {}", respositiry.findAll());
	}

}
