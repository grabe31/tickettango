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
public class CustController {
	@Autowired
	EventRepository repo;
	
	@GetMapping({"customerViewAll"})
	public String viewAllEventsCustomer(Model model) {
	
		model.addAttribute("event", repo.findAll());
		return "customerResults";
	}
	
	
	
	
}
