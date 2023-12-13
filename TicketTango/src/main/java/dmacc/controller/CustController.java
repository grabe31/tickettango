package dmacc.controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import dmacc.beans.Event;
import dmacc.beans.Ticket;
import dmacc.repository.TicketRepository;



/**
 * @author Eric Grabe - egrabe
 * CIS175 - Fall 2023
 * Nov 12, 2023
 */

@Controller
public class CustController {
	@Autowired
	TicketRepository repo;
	
	@GetMapping("/buyTicket/{id}")
	public String addNewTicket(@PathVariable("id") long id, Model model) {
		Ticket t = new Ticket();
		t.setEventId(id);
		//System.out.println(id);
		model.addAttribute("id", id);
		model.addAttribute("ticket", t);
		return "buyTicket";
				}
	
	@PostMapping("/buyTicket")
	public String addNewTicket(@ModelAttribute Ticket t, Model model) {
		//System.out.println(t.getEventId());
		repo.save(t);
		return "confirmPurchase";
	}
	
	
	@GetMapping("/getEmail")
	public String getEmail(Model model) {
		return "getEmail";
	}
	
	@PostMapping("/viewCustTickets")
	public String viewCustEvents(@ModelAttribute("ticket") Ticket t, Model model) {
		//t=new Ticket();
		ArrayList<Ticket> result = new ArrayList();
		System.out.println(t.getOwnerEmail());
		for(Ticket i: repo.findAll()) {
			System.out.println(i.getOwnerEmail());
			if(i.getOwnerEmail().equals(t.getOwnerEmail())) {
				result.add(i);
			}
		}
		model.addAttribute("tickets", result);

		System.out.println(result.get(0).getEventId());
		
		return "viewCustTickets";
	}
	

	
}
