package com.restapi.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.restapi.entity.Student;
import com.restapi.service.StudentService;

@RestController
@RequestMapping("restApi")
public class StudentController {
	
	@Autowired
	StudentService studentservice;
	
	@PostMapping("/add")
	public String addStudent(@RequestBody Student s) {
		return studentservice.addStudent(s);
	}
	
	@GetMapping("/getStudent")
	public List<Student> getStudentList() {
		return studentservice.getStudentList() ;
	}
	
	@GetMapping("/getstudent/{studentId}")
	public Student getStudentById(@PathVariable int studentId) {
		
		return studentservice.getStudentById(studentId);
	}
	
	
	
	@PutMapping("/updateStudent/{studentId}")
	public String updateEmpById(@RequestBody Student s,@PathVariable int studentId) {
		return studentservice.updateStudent(studentId, s);
	}
	
	@DeleteMapping("/deleteStudent/{studentId}")
	public String removeStudentById(@PathVariable int studentId) {
		
		return studentservice.removeStudentbyId(studentId) ;

	}
	
	

}
