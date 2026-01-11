package com.appointment.bookAppointment.entity;

import com.appointment.bookAppointment.enums.AppointmentStatus;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.Id;

import java.time.LocalDate;
import java.time.LocalTime;

@Entity
public class Requests {
    @Id
    private String id;
    private String username;
    private String email;
    private LocalDate date;
    private LocalTime time;

    @Enumerated(EnumType.STRING)
    private AppointmentStatus status;

    public Requests() {
    }

    public Requests(String username, String id, LocalDate date, String email, LocalTime time, AppointmentStatus status) {
        this.username = username;
        this.id = id;
        this.date = date;
        this.email = email;
        this.time = time;
        this.status=status;
    }

    public AppointmentStatus getStatus() {
        return status;
    }

    public void setStatus(AppointmentStatus status) {
        status = status;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
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

    @Override
    public String toString() {
        return "Requests{" +
                "id='" + id + '\'' +
                ", username='" + username + '\'' +
                ", email='" + email + '\'' +
                ", date=" + date +
                ", time=" + time +
                ", status=" + status+
                '}';
    }
}
