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

import com.edifzube.inventarioApp.model.Ingresos;
import com.edifzube.inventarioApp.model.Item;
import com.edifzube.inventarioApp.service.IngresosService;
import com.edifzube.inventarioApp.service.ItemService;

@Controller
public class IngresosController {
	
	@Autowired
	private IngresosService ingresosService;

	@Autowired
	private ItemService itemService;
	
	
	@GetMapping("/ingresos")
	public String getIngresos(Model model) {
		List<Ingresos> ingresosList = ingresosService.getIngresos();
		System.out.println("ingresosList: "+ingresosList);
		model.addAttribute("ingresos", ingresosList);	
		
		
		List<Item> itemsList = itemService.getItems();
		System.out.println("itemsList: "+itemsList);
		//model.addAttribute("items", itemsList);
		return "ingresos";
	}
	
	@PostMapping("/ingresos/addNew")
	public String addNew(Ingresos ingresos) {
		System.out.println("ingresos: "+ingresos);
		ingresosService.save(ingresos);
		return "redirect:/ingresos";
	}
	
	@RequestMapping("ingresos/findById")
	@ResponseBody
	public Optional<Ingresos> findById(int id) {
		return ingresosService.findById(id);
	}
	
	@RequestMapping(value = "/ingresos/update", method = {RequestMethod.PUT,RequestMethod.GET})
	public String update(Ingresos ingresos){
		ingresosService.save(ingresos);
		return "redirect:/ingresos";
	}
	
	@RequestMapping(value = "/ingresos/delete", method = {RequestMethod.DELETE,RequestMethod.GET})
	public String delete(Integer id){
		ingresosService.delete(id);
		return "redirect:/ingresos";
	}

}
