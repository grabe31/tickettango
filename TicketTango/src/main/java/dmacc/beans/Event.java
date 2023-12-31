package dmacc.beans;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import lombok.Data;

/**
 * @author Eric Grabe - egrabe
 * CIS175 - Fall 2023
 * Nov 12, 2023
 */
@Data
@Entity
public class Event {
	@Id
	@GeneratedValue
	private long id;
	private String eventName;
	private String venueName;
	private int ticketCount;
	private LocalDate eventDate;
	private String startTime;
	private String endTime;
	private String plannerEmail; 
	
	@Autowired
	@OneToMany
	private List<Ticket> tickets;

	
	public Event() {
		//super();
	}
	
	public Event(String eventName, String venueName, int ticketCount, 
				  LocalDate eventDate, String startTime, String endTime,
				  String plannerEmail) {
		this.eventName = eventName;
		this.venueName = venueName;
		this.eventDate = eventDate;
		this.ticketCount = ticketCount;
		this.startTime = startTime;
		this.endTime = endTime;
		this.plannerEmail= plannerEmail;
		this.tickets = new ArrayList<>();
		
	}
	
//	public void createTicket(long id, String ownerEmail) {
//		Ticket t = new Ticket(id, ownerEmail);
//		ticketCount--;
//		
//	}
	
	public void setTickets(List<Ticket> Tickets) {
		this.tickets = tickets;
	}
	
	
	
}
