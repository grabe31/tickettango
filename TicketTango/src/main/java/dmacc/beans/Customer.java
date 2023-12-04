package dmacc.beans;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import jakarta.persistence.Embeddable;
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
@Embeddable
public class Customer {
	
	@Id
	@GeneratedValue
	private long id;
	private String customerEmail;
	
	@Autowired
	@OneToMany
	private List<Ticket> tickets;

	
	public Customer() {
		//super();
	}
	
	public Customer(String customerEmail) {
		super();
		this.customerEmail = customerEmail;
		this.tickets = new ArrayList<>();
	}

	
	
	
}
