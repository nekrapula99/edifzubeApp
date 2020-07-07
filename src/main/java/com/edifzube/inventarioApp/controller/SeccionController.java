package com.edifzube.inventarioApp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class SeccionController {

	@GetMapping("/secciones")
	public String getSecciones() {
		return "seccion";
	}
}
