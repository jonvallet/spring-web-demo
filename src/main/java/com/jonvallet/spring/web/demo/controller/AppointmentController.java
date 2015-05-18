package com.jonvallet.spring.web.demo.controller;

import com.jonvallet.spring.web.demo.model.Appointment;
import com.jonvallet.spring.web.demo.model.AppointmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Jon Vallet
 */
@RestController
@RequestMapping("/appointment")
public class AppointmentController {

    @Autowired
    AppointmentRepository repository;

    @RequestMapping(method = RequestMethod.GET)
    public Iterable<Appointment> getAll() {
        return repository.findAll();
    }

    @RequestMapping(method = RequestMethod.POST)
    public void create(Appointment appointment) {
        repository.save(appointment);
    }

}
