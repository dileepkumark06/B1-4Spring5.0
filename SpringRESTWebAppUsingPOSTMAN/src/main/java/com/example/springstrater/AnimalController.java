package com.example.springstrater;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class AnimalController 
{
	@RequestMapping("jocker")
	public String home1()
	{
		System.out.println("Capgemini");
		return "animal.txt";
	}
}