package com.Nathalie.dojosNinjas.controllers;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.Nathalie.dojosNinjas.models.Ninja;
import com.Nathalie.dojosNinjas.services.AppService;

@Controller
public class NinjaController {
	private AppService appService;
	public NinjaController(AppService service) {
		this.appService = service;
	}
	@RequestMapping("/ninjas")
	public String Index(Model model) {
		model.addAttribute("ninjas", this.appService.allNinjas());
		return "/ninjas/index.jsp";
	}
	
	@RequestMapping("/ninjas/new")
	public String New(@ModelAttribute("ninja") Ninja ninja, Model model) {
		model.addAttribute("dojos", this.appService.allDojos());
		return "/ninjas/new.jsp";
	}
	@RequestMapping(value="/ninjas", method=RequestMethod.POST)
	public String Create(@Valid @ModelAttribute("ninja") Ninja ninja, BindingResult result, Model model) {
		if(result.hasErrors()) {
			model.addAttribute("dojos", this.appService.allDojos());
			return "/ninjas/new.jsp";
		}
		this.appService.createNinja(ninja);
		return "redirect:/ninjas";
	}
}