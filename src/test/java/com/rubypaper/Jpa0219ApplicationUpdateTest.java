package com.rubypaper;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.rubypaper.domain.EnrolPK;
import com.rubypaper.domain.EnrolRepository;
import com.rubypaper.domain.StudentRepository;

@SpringBootTest
class Jpa0219ApplicationUpdateTest {

	@Autowired
	private StudentRepository  studentRepo;

	@Autowired
	private EnrolRepository  enrolRepo;
	
	@Test
	void contextLoads() {
		
	    // studentRepo.deleteById("100");
		
		EnrolPK  enrol = new EnrolPK();
		enrol.setSno("200");
		enrol.setCno("C123");
	  	
	}

}
