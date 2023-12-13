package dmacc.beans;

import jakarta.persistence.Embeddable;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Data;

/**
 * @author Eric Grabe - egrabe
 * CIS175 - Fall 2023
 * Nov 12, 2023
 */
@Data
@Entity
@Embeddable
public class Ticket {
	
	@Id
	@GeneratedValue
	private long id;
	private long eventId;
	private String ownerEmail;
	private int admissions;
	
	public Ticket() {
		//super();
	}
	
	public Ticket(long id, long eventId, String ownerEmail, int admissions) {
		this.id = id;
		this.eventId = id;
		this.ownerEmail = ownerEmail;
		this.admissions = admissions;
	}
	
	


	
	
}
