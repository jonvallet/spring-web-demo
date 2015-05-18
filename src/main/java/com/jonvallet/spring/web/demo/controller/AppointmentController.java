package com.jonvallet.spring.web.demo.controller;

import com.jonvallet.spring.web.demo.model.Appointment;
import com.jonvallet.spring.web.demo.model.AppointmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
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
    public Page<Appointment> getPage(@RequestParam(value = "page", defaultValue = "0") int page,
                                     @RequestParam(value = "items", defaultValue = "20") int items) {

        return repository.findAll(new PageRequest(page, items));
    }

    @RequestMapping(method = RequestMethod.POST)
    public void create(@RequestBody Appointment appointment) {
        repository.save(appointment);
    }

}
