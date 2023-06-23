package com.example.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Hello {
	@RequestMapping("/hello")
	
	public String hello()
	{
	System.out.println("Hello");
	return "Hello World!";
	}
	
@RequestMapping("/cards")
	
	public String cards()
	{
	System.out.println("cards");
	return "Loading cards:)!";
	}

@RequestMapping("/loans")

public String loans()
{
System.out.println("loans");
return "Loans coming!";
}

}
