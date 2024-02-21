package com.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import com.rubypaper.domain.Enrol;
import com.rubypaper.domain.EnrolPK;
import com.rubypaper.domain.EnrolRepository;
import com.rubypaper.domain.Student;
import com.rubypaper.domain.StudentRepository;

@Controller
public class TestController {
	@Autowired
	private StudentRepository  studentRepo;

	@Autowired
	private EnrolRepository  enrolRepo;
	
	@GetMapping("/selectTest.do")
	String contextLoads() {
		EnrolPK enrol = new EnrolPK();
		enrol.setSno("100");
		enrol.setCno("C413");
		Enrol m =(Enrol) enrolRepo.findById(enrol).get();
		
		System.out.println("==>" +m.getStudent().getSname() + m.getGrade() );	
		
		return "index2.html";
	}
}