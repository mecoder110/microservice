package com.rizvi.movieticket.persistence;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.rizvi.movieticket.entities.MovieTicket;

@Repository
public interface MovieTicketRepository extends JpaRepository<MovieTicket, Long> {

	MovieTicket findById(long id);

	MovieTicket findByIsSeatAvailabe(boolean b);

	MovieTicket findBySeatNo(int seatNo);

	/*
	 * @Modifying
	 * 
	 * @Query("update Customer u set u.phone = :phone where u.id = :id") void
	 * updatePhone(@Param(value = "id") long id, @Param(value = "phone") String
	 * phone);
	 */
}
