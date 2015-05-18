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
    private String description;
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

    public void setDescription(String description) {
        this.description = description;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "Appointment{" +
                "description='" + description + '\'' +
                ", date=" + date +
                '}';
    }
}
