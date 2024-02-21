package com.rubypaper;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.rubypaper.domain.Enrol;
import com.rubypaper.domain.EnrolPK;
import com.rubypaper.domain.EnrolRepository;
import com.rubypaper.domain.Student;
import com.rubypaper.domain.StudentRepository;

@SpringBootTest
class Jpa0219ApplicationTests {
	
	@Autowired
	StudentRepository studentRepo;
	@Autowired
	EnrolRepository enrolRepo;
	
	
	@Test
	void contextLoads() {

	}
	

}
