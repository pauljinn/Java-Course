package com.learning.spring;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
	@Autowired
	StudentRepository repo;
	@GetMapping("students")
	public Iterable<Student> get(){
		return repo.findAll();
	}
}
