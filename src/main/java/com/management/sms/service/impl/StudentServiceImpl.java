package com.management.sms.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.management.sms.entity.Student;
import com.management.sms.repository.StudentRepository;
import com.management.sms.service.StudentService;

@Service
public class StudentServiceImpl implements StudentService {
	//autowired lageni karon 1 tai constructor ache
	public StudentRepository studentRepository;
	
	
	public StudentServiceImpl(StudentRepository studentRepository) {
		super();
		this.studentRepository = studentRepository;
	}


	@Override
	public List<Student> getAllStudents(){
		return studentRepository.findAll();
	}
}
