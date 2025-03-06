package com.learning.mvc.core;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MvcController {
	@Autowired
	StudentRepository repo;
	
	@GetMapping("/get/v1")
    //@ResponseBody -> When you don't want to return jsp instead json
	public ModelAndView get() {
		ModelAndView model = new ModelAndView("index");
		//Returning index.jsp page 
		Student s = repo.findById(1).orElse(null);
		model.addObject("student",s);
		System.out.println(s);
		return model;
	}
	
	@GetMapping("/get/v2")
	public String getV2(Model model) {
		//Returning index.jsp page 
		Student s = repo.findById(1).orElse(null);
		model.addAttribute("student",s);
		System.out.println(s);
		//Jsp page index.jsp
		return "index";
	}
	
	@GetMapping("/add-student")
	public String showAddStudentForm() {
		return "index";
	}
	
	@PostMapping("/update")
	//Required if we are using JPQL which is not transactional, Transaction life process handled by spring.
	@Transactional
	public String updateStudent(@RequestParam int rollNo, @RequestParam String name, Model model) {
	    int updatedRows = repo.updateStudentName(rollNo, name);
	    if (updatedRows > 0) {
	    	model.addAttribute("rows", updatedRows);
	        return "update-success";
	    } else {
	        return "failed";
	    }
	}
	
	
	
	
	
	
}
