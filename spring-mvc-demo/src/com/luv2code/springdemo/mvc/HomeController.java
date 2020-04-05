package com.luv2code.springdemo.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller //it also extends @Component(scannig purpose)
public class HomeController {
	
	@RequestMapping("/")
	public String showPage() {
		return "main-menu"; //add prefix and suffix automatically
	}

}
