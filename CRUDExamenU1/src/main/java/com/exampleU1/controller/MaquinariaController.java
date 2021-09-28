package com.exampleU1.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.exampleU1.iservice.ImaquinariaService;
import com.exampleU1.models.Maquinaria;

@Controller
@RequestMapping
public class MaquinariaController {
	@Autowired
	private ImaquinariaService service;
	
	@GetMapping("/lista")
	public String listar(Model model) {
		List<Maquinaria> maquinarias=service.listar();
		model.addAttribute("maquinarias", maquinarias);
		return "index";
	}
	
	@GetMapping("/nuevo")
	public String agregar(Model model) {
		model.addAttribute("maquinaria",new Maquinaria() );
		return "maquinaria_add";
	}
	
	@GetMapping("/save")
	public String guardar(@Validated Maquinaria maqui, Model model) {
		service.guardar(maqui);
		return "redirect:/lista";
	}
	
	@GetMapping("/editar/{id}")
	public String editar(@PathVariable int id, Model model) {
		Optional<Maquinaria> maquinaria=service.buscarId(id);
		model.addAttribute("maquinaria", maquinaria);
		return "maquinaria_add";
	}
	
	@GetMapping("/eliminar/{id}")
	public String eliminar(@PathVariable int id, Model model) {
		service.eliminar(id);
		return "redirect:/lista";
	}
}
