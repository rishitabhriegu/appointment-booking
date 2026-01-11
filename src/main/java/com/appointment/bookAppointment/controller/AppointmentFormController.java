package com.appointment.bookAppointment.controller;

import com.appointment.bookAppointment.Service.RequestService;
import com.appointment.bookAppointment.entity.Requests;
import com.appointment.bookAppointment.enums.AppointmentStatus;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.UUID;

@Controller
public class AppointmentFormController {

    private final RequestService requestService;

    public AppointmentFormController(RequestService requestService) {
        this.requestService = requestService;
    }

    @GetMapping("/appointment-booking")
    public String showAppointmentBookingPage(){
        return "appointmentForm";
    }

    @PostMapping("/appointment-booking")
    public String showAppointmentBookingStatus(
            @RequestParam String username,
            @RequestParam String email,
            @RequestParam @DateTimeFormat(iso = DateTimeFormat.ISO.DATE) LocalDate date,
            @RequestParam @DateTimeFormat(iso = DateTimeFormat.ISO.TIME) LocalTime time,
            RedirectAttributes redirectAttributes) {

        Requests request = new Requests(
                username,
                UUID.randomUUID().toString(),
                date,
                email,
                time,
                AppointmentStatus.PENDING
        );

        requestService.saveRequest(request);

        redirectAttributes.addFlashAttribute(
                "status", "Appointment Pending ⏳- You will receive email notification!"
        );

        return "redirect:/appointment-booking";
    }
}
