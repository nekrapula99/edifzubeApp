package com.edifzube.inventarioApp.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.edifzube.inventarioApp.model.Item;
import com.edifzube.inventarioApp.model.Seccion;
import com.edifzube.inventarioApp.service.ItemService;
import com.edifzube.inventarioApp.service.SeccionService;

@Controller
public class ItemController {
	

	@Autowired
	private ItemService itemService;
	
	@Autowired
	private SeccionService seccionService;
	
	@GetMapping("/items")
	public String getItems(Model model) {
		List<Item> itemsList = itemService.getItems();
		model.addAttribute("items", itemsList);	
		List<Seccion> seccionesList = seccionService.getSecciones();
		model.addAttribute("secciones", seccionesList);
		return "item";
	}
	
	@PostMapping("/items/addNew")
	public String addNew(Item item) {			
		System.out.println("item CON: "+item);
		itemService.save(item);
		return "redirect:/items";
	}
	
	@RequestMapping("items/findById")
	@ResponseBody
	public Optional<Item> findById(int id) {
		return itemService.findById(id);
	}
	
	@RequestMapping(value = "/items/update", method = {RequestMethod.PUT,RequestMethod.GET})
	public String update(Item item){
		itemService.save(item);
		return "redirect:/items";
	}
	
	@RequestMapping(value = "/items/delete", method = {RequestMethod.DELETE,RequestMethod.GET})
	public String delete(Integer id){
		itemService.delete(id);
		return "redirect:/items";
	}

}
