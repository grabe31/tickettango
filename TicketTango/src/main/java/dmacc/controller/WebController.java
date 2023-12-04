package dmacc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import dmacc.beans.Event;
import dmacc.repository.EventRepository;

/**
 * @author Eric Grabe - egrabe
 * CIS175 - Fall 2023
 * Nov 12, 2023
 */

@Controller
public class WebController {
	@Autowired
	EventRepository repo;
	
	@GetMapping({"plannerViewAll"})
	public String viewAllEvents(Model model) {
		if(repo.findAll().isEmpty()) {
			return addNewEvent(model);
			}
	
		model.addAttribute("event", repo.findAll());
		return "results";
	}
	
	
	
	@GetMapping("/inputEvent")
	public String addNewEvent(Model model) {
		Event e = new Event();
		model.addAttribute("event", e);
		return "input";
				}
	
	@PostMapping("/inputEvent")
	public String addNewEvent(@ModelAttribute Event e, Model model) {
		//System.out.println(e.toString());
		repo.save(e);
		return "results";
	}
	
	@GetMapping("/edit/{id}")
	public String showUpdateEvent(@PathVariable("id") long id, Model model) {
		Event e = repo.findById(id).orElse(null);
		model.addAttribute("event", e);
		return "input";
	}
	
	@PostMapping("/update/{id}")
	public String reviseEvent(Event e, Model model) {
	repo.save(e);
	return viewAllEvents(model);
	}
	
	@GetMapping("/delete/{id}")
	public String deleteEvent(@PathVariable("id") long id, Model model) {
	Event e = repo.findById(id).orElse(null);
	repo.delete(e);
	return viewAllEvents(model);
	}

}
