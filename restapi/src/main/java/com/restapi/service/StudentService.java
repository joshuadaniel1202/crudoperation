package com.restapi.service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

import com.restapi.ResourceNotFoundException.ResourceNotFoundException;
import com.restapi.entity.Student;

@Service
public class StudentService {

	public ArrayList<Student> students=new ArrayList<Student>(Arrays.asList(new Student("joshua",28,1,"IT",12345),new Student("PRAMOD",28,2,"ELEC",54321)));
	
	public String addStudent(Student s) {
		students.add(s);
		return "Employee added sucessfully";
	}
	
	public List<Student> getStudentList(){
		return  students;
	}
	
	public Student getStudentById(int studentid) {
		boolean found = false;
		Student s=null;
		
		for (Student std:students) {
			if(std.getStdId()==studentid) {
				s=std;
		found=true;}}
		return s;
		}
		
	
		
		
		
	
	
	public String updateStudent(int studentId, Student s) {
		boolean found = false;

		for(Student sn:students) {
			if(sn.getStdId() == studentId) {
				students.set(studentId, s);
			  found = true;
			  
			  break;
			}
			
		}
		if(!found) {
			throw new ResourceNotFoundException("Student","Id",studentId);
		}
		return "Employee suceesfully updated";
	}
	
	public String removeStudentbyId(int studentId) {
		boolean found = false;
		for(int i=0; i<students.size();i++) {
			Student s = students.get(i);
			if(s.getStdId()==studentId) {
			  students.remove(i);
			  found = true;
			  break;
			}
	}
		return "Employee deleted successfully";
}
}
