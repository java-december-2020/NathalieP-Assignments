package com.Nathalie.ninjagold.controllers;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Random;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.Nathalie.ninjagold.models.Building;

@Controller
public class HomeController {
	@RequestMapping("/Gold")
	public String gold(HttpSession session, Model model) {
		ArrayList<String> activityLog = new ArrayList<String>();
		if(session.getAttribute("totalGold") == null) {
			session.setAttribute("totalGold", 0);
		}
		if(session.getAttribute("activityLog") == null){
				session.setAttribute("activityLog", activityLog);
	}
		Building farm = new Building("farm", 10, 20, false);
		Building cave = new Building("cave", 5, 10, false);
		Building house = new Building("house", 2, 5, false);
		Building casino = new Building("casino", -50, 50, true);
		Building store = new Building("store", 20, 80, true);
		
		Building[] myBuildings = new Building[] {farm, cave, house, casino, store};
		
		
		model.addAttribute("myBuildings", myBuildings);
		model.addAttribute("activityLog", session.getAttribute("activityLog"));
		model.addAttribute("totalGold", session.getAttribute("totalGold"));
		
		return "Gold.jsp";
		

	}
	
	@RequestMapping(path="/getGold", method=RequestMethod.POST)
	public String getGold(@RequestParam(value="building") String building, HttpSession session) {
		ArrayList<String> activities = (ArrayList<String>)session.getAttribute("activityLog");
		Random r = new Random();
		LocalDate date = LocalDate.now();
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MMMM dd YYYY h:mma");
		int gold = (int)session.getAttribute("totalGold");
		int goldThisTurn = 0;
		if(building.equals("farm")) {
			// do farm stuff
			goldThisTurn = r.nextInt(20 - 10) + 10;
			activities.add("You entered the farm, and earned " + goldThisTurn + " gold");
		} else if(building.equals("cave")) {
			// do cave stuff
			goldThisTurn = r.nextInt(10 - 5) + 5;
			activities.add("You entered a cave, and earned " + goldThisTurn + " gold");
		} else if(building.equals("house")) {
			// do house stuff
			goldThisTurn = r.nextInt(5 - 2) + 2;
			activities.add("You entered the house, and earned " + goldThisTurn + " gold");
		} else {
			// do casino stuff
			goldThisTurn = r.nextInt(50 - 1) + 1;
			if(r.nextBoolean()) {
				goldThisTurn = goldThisTurn * -1;
			}
			if(goldThisTurn < 0) {
				activities.add("You entered a casino, and lost " + goldThisTurn + " gold");
			} else {
				activities.add("You entered a casino, and earned " + goldThisTurn + " gold");
			}
		}
		
		System.out.println(activities);
		session.setAttribute("totalGold", gold += goldThisTurn);
		
		return "redirect:/Gold";
	}
}

