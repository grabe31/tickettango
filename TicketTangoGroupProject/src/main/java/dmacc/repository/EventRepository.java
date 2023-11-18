package dmacc.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import dmacc.beans.Event;

/**
 * @author Eric Grabe - egrabe
 * CIS175 - Fall 2023
 * Nov 18, 2023
 */

@Repository
public interface EventRepository extends JpaRepository<Event, Long> {

}
