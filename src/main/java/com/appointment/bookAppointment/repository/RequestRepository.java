package com.appointment.bookAppointment.repository;

import com.appointment.bookAppointment.entity.Requests;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RequestRepository extends JpaRepository<Requests, String> {
}
