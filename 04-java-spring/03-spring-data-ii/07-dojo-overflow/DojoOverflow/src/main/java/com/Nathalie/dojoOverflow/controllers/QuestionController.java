package com.Nathalie.dojoOverflow.controllers;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.Nathalie.dojoOverflow.models.Answer;
import com.Nathalie.dojoOverflow.models.NewQuestion;
import com.Nathalie.dojoOverflow.services.AppService;

@Controller
public class QuestionController {
	private final AppService service;
	public QuestionController(AppService service) {
		this.service = service;
	}
	@GetMapping("/")
	public String Index(Model model) {
		model.addAttribute("questions", this.service.getQuestions());
		return "index.jsp";
	}
	@GetMapping("/new")
	public String New(@ModelAttribute("newQuest") NewQuestion newQuest) {
		return "new.jsp";
	}
	@GetMapping("/{id}")
	public String Show(@PathVariable("id") Long id, @ModelAttribute("ans") Answer ans, Model model) {
		model.addAttribute("question", this.service.getQuestion(id));
		return "show.jsp";
	}
	@PostMapping("/")
	public String Create(@Valid @ModelAttribute("newQuest") NewQuestion newQuest, 
		BindingResult result) {
		if(result.hasErrors())
			return "new.jsp";
		this.service.createQuestion(newQuest);
		return "redirect:/";
	}
	@PostMapping("/answers")
	public String CreateAnswer(@Valid @ModelAttribute("ans") Answer ans, BindingResult result) {
		if(result.hasErrors())
			return "show.jsp";
		Answer newAnswer = this.service.createAnswer(ans);
		return "redirect:/" + newAnswer.getQuestion().getId();
	}
}	