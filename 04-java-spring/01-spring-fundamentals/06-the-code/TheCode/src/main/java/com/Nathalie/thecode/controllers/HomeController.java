package com.Nathalie.thecode.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
public class HomeController {
	private Boolean isCorrectCode(String guess) {
		return guess.equals("bushido");
	}
	private String[] getTenets() {
		return new String[] {
			"Baby Yoda Frappuccino", "Tiramisu Frappuccino", "The Medicine Ball", "Nutella Frappuccino", "Cotton Candy Frappuccino"
		};
	}
	@RequestMapping("/")
	public String Index() {
		return "index.jsp";
	}
	@RequestMapping(value="/attempt", method=RequestMethod.POST)
	public String Attempt(@RequestParam(value="guess") String guess, 
			Model model, RedirectAttributes rAttributes) {
		if(isCorrectCode(guess)) {
			return "redirect:/code";
		}
		rAttributes.addFlashAttribute("error", "You do not know the way");
		return "redirect:/";		
	}
	@RequestMapping("/code")
	public String Code(Model model) {
		model.addAttribute("tenets", getTenets());
		return "Code.jsp";
	
	}
}
