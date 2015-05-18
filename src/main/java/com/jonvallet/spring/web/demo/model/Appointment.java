package com.jonvallet.spring.web.demo.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.Date;

/**
 * @author Jon Vallet
 */
@Entity
public class Appointment {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private long id;
    public final String description;
    public final Date date;

    public Appointment(String description, Date date){
        this.description = description;
        this.date = date;
    }

}
