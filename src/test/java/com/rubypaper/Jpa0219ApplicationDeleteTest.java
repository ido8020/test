package com.rubypaper;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.rubypaper.domain.EnrolPK;
import com.rubypaper.domain.EnrolRepository;
import com.rubypaper.domain.Student;
import com.rubypaper.domain.StudentRepository;

@SpringBootTest
class Jpa0219ApplicationDeleteTest {

	@Autowired
	private StudentRepository  studentRepo;

	@Autowired
	private EnrolRepository  enrolRepo;
	
	@Test
	void contextLoads() {
		Student student = studentRepo.findById("300").get();
	  	student.setSname("영심이");
		studentRepo.save(student);
	}

}
