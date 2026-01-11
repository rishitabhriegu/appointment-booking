package com.appointment.bookAppointment.controller;

import com.appointment.bookAppointment.Service.RequestService;
import com.appointment.bookAppointment.entity.Requests;
import org.springframework.ui.Model;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class RequestController {
    private RequestService requestsService;

    public RequestController(RequestService requestsService) {
        super();
        this.requestsService = requestsService;
    }

    @GetMapping("/requests")
    public String showAllRequests(Model map){

        List<Requests> requestsList = requestsService.getAllRequests();
        map.addAttribute("requests", requestsList);

        return "requests";
    }
}
