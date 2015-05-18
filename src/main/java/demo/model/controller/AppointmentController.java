package demo.model.controller;

import demo.model.Appointment;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * @author Jon Vallet
 */
@RestController
@RequestMapping("/appointment")
public class AppointmentController {

  @RequestMapping(method = RequestMethod.GET)
  public List<Appointment> getAppointments(){
      List<Appointment> result = new ArrayList<>();

      result.add(new Appointment("Test1", new Date()));
      result.add(new Appointment("Test2", new Date()));

      return result;
  }

}
