package com.appointment.bookAppointment.controller;

import com.appointment.bookAppointment.Service.RequestService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class AdminController {

    private final RequestService requestService;

    public AdminController(RequestService requestService) {
        this.requestService = requestService;
    }

    @PostMapping("/approve/{id}")
    public String approve(@PathVariable String id) {
        requestService.approveRequest(id);
        return "redirect:/requests";
    }

    @PostMapping("/reject/{id}")
    public String reject(@PathVariable String id) {
        requestService.rejectRequest(id);
        return "redirect:/requests";
    }
}
