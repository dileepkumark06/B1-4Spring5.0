package com.example.springstrater;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController
{
	@RequestMapping("arjun")
	public String home()
	{
		System.out.println("Welcome to TechnoServe");
		return "home.jsp";
	}
}