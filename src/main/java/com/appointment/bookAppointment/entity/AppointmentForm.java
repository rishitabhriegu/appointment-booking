package com.appointment.bookAppointment.entity;


import jakarta.persistence.Entity;
import jakarta.persistence.Id;

import java.time.LocalDate;
import java.time.LocalTime;

public class AppointmentForm {

    private String name;
    private String email;
    private LocalDate date;
    private LocalTime time;

    public AppointmentForm(LocalDate date, LocalTime time, String name, String email) {
        this.date = date;
        this.time = time;
        this.name = name;
        this.email=email;
    }

    @Override
    public String toString() {
        return "AppointmentForm{" +
                "name='" + name + '\'' +
                ", date=" + date +
                ", time=" + time +
                ", email" + email+
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public LocalTime getTime() {
        return time;
    }

    public void setTime(LocalTime time) {
        this.time = time;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
