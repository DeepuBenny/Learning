package com.example.demo.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.StudentEntity;
import com.example.demo.repo.StudRepo;

@RestController
public class StudentController 
{

	@Autowired
	StudRepo stud;
	
	@GetMapping("/all")
	public List<StudentEntity> getStudent()
	{
	List<StudentEntity> stList=	stud.findAll();
	return stList;
		
	}
	
	@GetMapping("/{id}")
	public  Optional<StudentEntity> getByIds( @PathVariable("id") Long id)
	{
		Optional<StudentEntity> st=stud.findById(id);
		return st;
	}
	
	@PostMapping("/save")
	public String saveStudent(@RequestBody StudentEntity student)
	{
		stud.save(student);
		return "saved";
	}
	

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
