package com.jonvallet.spring.web.demo.model;

import org.springframework.data.repository.CrudRepository;

/**
 * @author Jon Vallet
 */
public interface AppointmentRepository extends CrudRepository<Appointment, Long> {
}
