package com.learning.springmvc;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import jakarta.websocket.server.PathParam;

@Controller
public class HomeController {
	@RequestMapping("/")
	public String home() {
		return "index";
	}
	
//	@RequestMapping("/add")
//	public String add(HttpServletRequest req, HttpServletResponse res) {
//		int a = Integer.parseInt(req.getParameter("numOne"));
//		int b = Integer.parseInt(req.getParameter("numTwo"));
//		HttpSession session = req.getSession();
//		session.setAttribute("result", (a+b));
//		return "result.jsp";
//	}
	
//	@RequestMapping("/add")
//	public ModelAndView addV2(@PathParam("numOne")String numOne, @PathParam("numTwo")String numTwo) {
//		int a = Integer.parseInt(numOne);
//		int b = Integer.parseInt(numTwo);
//		int sum = a+b;
//		ModelAndView mv = new ModelAndView();
//		mv.setViewName("result.jsp");
//		mv.addObject("result", sum);
//		return mv;
//		
//	}
	
//	@RequestMapping("/add")
//	public ModelAndView addV3(@PathParam("numOne")String numOne, @PathParam("numTwo")String numTwo) {
//		int a = Integer.parseInt(numOne);
//		int b = Integer.parseInt(numTwo);
//		int sum = a+b;
//		ModelAndView mv = new ModelAndView();
//		mv.setViewName("result");
//		mv.addObject("result", sum);
//		return mv;
//		
//	}
	
	@RequestMapping("/add")
	public String addV4(@PathParam("numOne")String numOne, @PathParam("numTwo")String numTwo, Model m) {
		int a = Integer.parseInt(numOne);
		int b = Integer.parseInt(numTwo);
		int sum = a+b;
		m.addAttribute("result", sum);
		return "result";
		
	}
	
	//Model Attribute at method level 
	@ModelAttribute
	public void modelData(Model model) {
		model.addAttribute("name", "Alien");
		model.addAttribute(model);
	}
	
	@RequestMapping("/addAlien")
	public String addAlien(@ModelAttribute("a1") Alien a) {
		return "alienResult";
	}
	
	
}
