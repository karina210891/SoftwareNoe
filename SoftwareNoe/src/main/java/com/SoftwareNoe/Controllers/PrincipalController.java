package com.SoftwareNoe.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/principal")
public class PrincipalController {
	
	@RequestMapping("/")
	public String inicio() {
		return "index";
	}
}