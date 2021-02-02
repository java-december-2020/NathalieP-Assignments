package com.Nathalie.dojosurvey.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HomeController {
	private String[] getLanguages() {
		return new String[] {
			"HTML", "Java", "Python", "JavaScript"
		};
	}
	private String[] getLocations() {
		return new String[] {
			"Seattle", "Dallas", "San Jose", "Chicago", "Tulsa"
		};
	}
	@RequestMapping("/")
	public String Index(Model viewModel) {
		viewModel.addAttribute("locations", getLocations());
		viewModel.addAttribute("languages", getLanguages());
		return "dojo.jsp";
	}
	@RequestMapping(value="/survey", method=RequestMethod.POST)
	public String Results(@RequestParam(value="name") String name, 
			@RequestParam(value="location") String location,
			@RequestParam(value="language") String language,
			@RequestParam(value="comment") String comment,
			Model viewmodel){
		viewmodel.addAttribute("result", new Survey(name, location, language, comment));
		return "survey.jsp";
	}
}
