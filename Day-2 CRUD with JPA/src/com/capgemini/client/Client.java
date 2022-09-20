package com.capgemini.client;

import com.capgemini.entities.Student;
import com.capgemini.service.StudentService;
import com.capgemini.service.StudentServiceImpl;

public class Client {

	public static void main(String[] args) {
		StudentService service=new StudentServiceImpl();
		
		Student s=new Student();
		
	/*//create Operation
	s.setRollno(101);
	("dhanu");
	service.addStudent(s);*/
		
	/*//create Operation
	s.setRollno(102);
	s.setName("shruti");
	service.addStudent(s);*/
		
	/*//retrieve data
	s=service.getStudentById(102);
	System.out.println("Student Roll No: "+s.getRollno());
	System.out.println("Student Name: "+s.getName());*/
		
	/*//update
	s=service.getStudentById(102);
	s.setName("sanu");
	service.updateStudent(s);*/
		
		//delete
		s=service.getStudentById(101);
		service.deleteStudent(s);
		System.out.println("Data is deleted");



	}

}

