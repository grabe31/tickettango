package dmacc.controller;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import dmacc.beans.Event;

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
	
//	@Bean
//	public Player player() {
//		Player bean = new Player("Brown", 11);
//		return bean;
//	}

}
