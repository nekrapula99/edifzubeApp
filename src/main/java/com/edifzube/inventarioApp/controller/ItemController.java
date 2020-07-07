package com.edifzube.inventarioApp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ItemController {
	
	@GetMapping("/items")
	public String getItems() {
		return "item";
	}

}
