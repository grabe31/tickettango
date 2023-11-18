package dmacc.beans;

import java.time.LocalDate;
import java.time.LocalTime;

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
public class Event {
	
	@Id
	@GeneratedValue
	private Long id;
	private LocalDate eventDate;
	private String venueName;
	private int ticketCount;
	private String eventTitle;
	private String performers;
	private LocalTime startTime;
	private LocalTime endTime;
	
	//@Autowired
	//private Ticket ticket;
	
	public Event() {
		super();
	}
	
	public Event(LocalDate eventDate, String venueName, int ticketCount, 
					String eventTitle, String performers, 
					LocalTime startTime, LocalTime endTime) {
		this.eventDate = eventDate;
		this.venueName = venueName;
		this.ticketCount = ticketCount;
		this.eventTitle = eventTitle;
		this.performers = performers;
		this.startTime = startTime;
		this.endTime = endTime;
	}
	
	
	
	/**
	 * @return the id
	 */
	public Long getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(Long id) {
		id = id;
	}

	/**
	 * @return the eventDate
	 */
	public LocalDate getEventDate() {
		return eventDate;
	}
	/**
	 * @param eventDate the eventDate to set
	 */
	public void setEventDate(LocalDate eventDate) {
		this.eventDate = eventDate;
	}
	/**
	 * @return the venueName
	 */
	public String getVenueName() {
		return venueName;
	}
	/**
	 * @param venueName the venueName to set
	 */
	public void setVenueName(String venueName) {
		this.venueName = venueName;
	}
	/**
	 * @return the ticketCount
	 */
	public int getTicketCount() {
		return ticketCount;
	}
	/**
	 * @param ticketCount the ticketCount to set
	 */
	public void setTicketCount(int ticketCount) {
		this.ticketCount = ticketCount;
	}
	/**
	 * @return the eventTitle
	 */
	public String getEventTitle() {
		return eventTitle;
	}
	/**
	 * @param eventTitle the eventTitle to set
	 */
	public void setEventTitle(String eventTitle) {
		this.eventTitle = eventTitle;
	}
	/**
	 * @return the performers
	 */
	public String getPerformers() {
		return performers;
	}
	/**
	 * @param performers the performers to set
	 */
	public void setPerformers(String performers) {
		this.performers = performers;
	}
	/**
	 * @return the startTime
	 */
	public LocalTime getStartTime() {
		return startTime;
	}
	/**
	 * @param startTime the startTime to set
	 */
	public void setStartTime(LocalTime startTime) {
		this.startTime = startTime;
	}
	/**
	 * @return the endTime
	 */
	public LocalTime getEndTime() {
		return endTime;
	}
	/**
	 * @param endTime the endTime to set
	 */
	public void setEndTime(LocalTime endTime) {
		this.endTime = endTime;
	}
	@Override
	public String toString() {
		return "Event [eventDate=" + eventDate + ", venueName=" + venueName + ", ticketCount=" + ticketCount
				+ ", eventTitle=" + eventTitle + ", performers=" + performers + ", startTime=" + startTime
				+ ", endTime=" + endTime + "]";
	}
	
	
	

}
