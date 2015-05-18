package com.jonvallet.spring.web.demo.model;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;

import java.awt.print.Pageable;

/**
 * @author Jon Vallet
 */
public interface AppointmentRepository extends PagingAndSortingRepository<Appointment, Long> {

}
