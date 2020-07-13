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

import com.edifzube.inventarioApp.model.Seccion;
import com.edifzube.inventarioApp.service.SeccionService;

@Controller
public class SeccionController {


	@Autowired
	private SeccionService seccionService;
	
	@GetMapping("/secciones")
	public String getSecciones(Model model) {
		List<Seccion> seccionesList = seccionService.getSecciones();
		System.out.println("seccionesList controller: "+seccionesList);
		model.addAttribute("secciones", seccionesList);
		return "seccion";
	}
	
	@PostMapping("/secciones/addNew")
	public String addNewSeccion(Seccion seccion) {
		seccionService.save(seccion);
		return "redirect:/secciones";
	}
	
	@RequestMapping("secciones/findById")
	@ResponseBody
	public Optional<Seccion> findById(int id) {
		return seccionService.findById(id);
	}
	
	@RequestMapping(value = "/secciones/update", method = {RequestMethod.PUT,RequestMethod.GET})
	public String update(Seccion seccion){
		seccionService.save(seccion);
		return "redirect:/secciones";
	}
	
	@RequestMapping(value = "/secciones/delete", method = {RequestMethod.DELETE,RequestMethod.GET})
	public String delete(Integer id){
		seccionService.delete(id);
		return "redirect:/secciones";
	}
}
