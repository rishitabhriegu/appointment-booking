package com.appointment.bookAppointment.Service;

import com.appointment.bookAppointment.enums.AppointmentStatus;
import com.appointment.bookAppointment.repository.RequestRepository;
import com.appointment.bookAppointment.entity.Requests;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class RequestService {

    private final RequestRepository repository;
    private final EmailService emailService;

    public RequestService(RequestRepository repository, EmailService emailService) {
        this.repository = repository;
        this.emailService = emailService;
    }

    public List<Requests> getAllRequests() {
        return repository.findAll();
    }

    public void saveRequest(Requests request) {
        repository.save(request);
    }

    public void approveRequest(String id) {

        Requests request = repository.findById(id)
                .orElseThrow(() -> new RuntimeException("Request not found"));

        request.setStatus(AppointmentStatus.APPROVED);
        repository.save(request);

        emailService.sendEmail(
                request.getEmail(),
                "Appointment Confirmed ✅",
                "Hi " + request.getUsername() +
                        ",\n\nYour appointment is CONFIRMED.\n" +
                        "Date: " + request.getDate() +
                        "\nTime: " + request.getTime()
        );
    }

    public void rejectRequest(String id) {

        Requests request = repository.findById(id)
                .orElseThrow(() -> new RuntimeException("Request not found"));

        request.setStatus(AppointmentStatus.REJECTED);
        repository.save(request);

        emailService.sendEmail(
                request.getEmail(),
                "Appointment Rejected ❌",
                "Hi " + request.getUsername() +
                        ",\n\nUnfortunately your appointment request was rejected."
        );
    }

}
