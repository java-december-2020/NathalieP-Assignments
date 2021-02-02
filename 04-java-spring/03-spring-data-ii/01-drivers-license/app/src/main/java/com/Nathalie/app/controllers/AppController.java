package com.Nathalie.app.controllers;

import java.util.List;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.Nathalie.app.models.License;
import com.Nathalie.app.models.Person;
import com.Nathalie.app.services.DMVService;

@Controller
public class AppController {
	private final DMVService service;
	public AppController(DMVService serv) {
		this.service = serv;
	}
	@RequestMapping("/")
	public String Index(Model model) {
		List<Person> people = service.getPeople();
		model.addAttribute("persons", people);
		return "index.jsp";
	}
	@RequestMapping(value="/", method=RequestMethod.POST)
	public String CreatePerson(@Valid @ModelAttribute("person") Person person, BindingResult result) {
		if(result.hasErrors() ) {
			return "new.jsp";
		}
		service.createPerson(person);
		return "redirect:/";
	}
	@RequestMapping("/{id}")
	public String ShowPerson(@PathVariable("id") Long id, Model model) {
		model.addAttribute("person", service.getPerson(id));
		return "show.jsp";
	}
	@RequestMapping("/new")
	public String NewPerson(@ModelAttribute("person") Person person) {
		return "new.jsp";
	}
	@RequestMapping("/licenses/new")
	public String NewLicense(@ModelAttribute("license") License lic, Model model) {
		List<Person> unlicensed = service.getUnlicensedPeople();
		model.addAttribute("persons", unlicensed);
		return "/licenses/new.jsp";
	}
	@RequestMapping(value = "/licenses", method=RequestMethod.POST)
	public String CreateLicense(@Valid @ModelAttribute("license") License lic, BindingResult result) {
		if(result.hasErrors())
			return "/licenses/new.jsp";
		service.createLicense(lic);
		return "redirect:/";
	}
}