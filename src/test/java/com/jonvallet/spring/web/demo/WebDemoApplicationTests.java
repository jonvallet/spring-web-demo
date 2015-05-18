package com.jonvallet.spring.web.demo;

import com.jonvallet.spring.web.demo.controller.AppointmentController;
import com.jonvallet.spring.web.demo.model.Appointment;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.Date;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = WebDemoApplication.class)
@WebAppConfiguration
public class WebDemoApplicationTests {

    @Autowired
    AppointmentController controller;

	@Test
	public void contextLoads() {
	}

    @Test
    public void testCreateAppointment(){
        Date date = new Date();
        Appointment expectedValue = new Appointment("Test1", date);

        controller.create(new Appointment("Test1", date));

        Page<Appointment> page = controller.getPage(0, 20);

        Assert.assertTrue(page.getTotalElements() == 1);

        Appointment actualValue = page.getContent().get(0);

        Assert.assertEquals(expectedValue.getDescription(), actualValue.getDescription());
        Assert.assertEquals(expectedValue.getDate(), actualValue.getDate());
    }

}
