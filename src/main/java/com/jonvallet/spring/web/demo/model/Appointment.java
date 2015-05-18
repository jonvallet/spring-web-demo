package com.jonvallet.spring.web.demo.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.Date;

/**
 * @author Jon Vallet
 */
@Entity
@Table(name = "Appointments")
public class Appointment {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private long id;
    @NotNull
    @Size(min = 1, max = 255)
    private String description;
    @NotNull
    private Date date;

    protected Appointment(){}

    public Appointment(String description, Date date){
        this.description = description;
        this.date = date;
    }

    public String getDescription() {
        return description;
    }

    public Date getDate() {
        return date;
    }

    @Override
    public String toString() {
        return "Appointment{" +
                "description='" + description + '\'' +
                ", date=" + date +
                '}';
    }
}
