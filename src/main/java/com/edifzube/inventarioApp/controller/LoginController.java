package com.edifzube.inventarioApp.controller;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.edifzube.inventarioApp.model.UserCredential;

@Controller
public class LoginController {
	
	private static final Log LOGGER = LogFactory.getLog(LoginController.class);
	
	@GetMapping("/")
	public String redirectToLogin() {
		return "redirect:/login";
	}
	
	@GetMapping("/login")
	public String showLoginForm(Model model,
			@RequestParam(name="error", required = false) String error) {
		model.addAttribute("error", error);
		model.addAttribute("userCredentials", new UserCredential());
		return "login";
	}

	@PostMapping("/logincheck")
	public String loginCheck(@ModelAttribute(name="userCredentials") UserCredential userCredential) {
		
		if(userCredential.getUsername().equals("admin") && userCredential.getPassword().equals("admin")) {
			LOGGER.info("BIENVENIDO: "+userCredential.getUsername());
			return "index";
		}
		
		return "redirect:/login?error";
	}
}
