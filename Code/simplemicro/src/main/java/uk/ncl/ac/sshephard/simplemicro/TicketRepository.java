package uk.ncl.ac.sshephard.simplemicro;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface TicketRepository extends CrudRepository<Ticket, Integer> {

	List<Ticket> findAllBy();
	
	List<Ticket> findBySport(String sport);
}
