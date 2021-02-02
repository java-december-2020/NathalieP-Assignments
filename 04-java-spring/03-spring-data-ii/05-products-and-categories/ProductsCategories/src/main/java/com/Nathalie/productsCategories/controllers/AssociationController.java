package com.Nathalie.productsCategories.controllers;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.Nathalie.productsCategories.models.Association;
import com.Nathalie.productsCategories.services.AppService;

@Controller
public class AssociationController {
	private final AppService appService;
	public AssociationController(AppService service) {
		this.appService = service;
	}
	@PostMapping("/associations/{kind}")
	public String Create(@Valid @ModelAttribute("association") Association association,
			BindingResult result,
			@PathVariable("kind") String kind) {
		if(result.hasErrors())
			return String.format("/%s/show.jsp", kind);
		appService.createAssociation(association);
		return "redirect:/";
	}
}