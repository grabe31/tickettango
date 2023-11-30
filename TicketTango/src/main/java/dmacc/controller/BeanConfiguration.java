package dmacc.controller;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import dmacc.beans.Event;
import dmacc.beans.Ticket;
import java.util.ArrayList;
import java.util.List;

/**
 * @author Eric Grabe - egrabe
 * CIS175 - Fall 2023
 * Nov 12, 2023
 */

@Configuration
public class BeanConfiguration {
	
	@Bean
	public Event event() {
		Event bean = new Event();
		return bean;
	}
	
	@Bean
	public Ticket ticket() {
		Ticket bean = new Ticket();
		return bean;
	}
	
	@Bean
	public ArrayList<Ticket> ticketArrayList(){
		return new ArrayList<>();
	}

}
