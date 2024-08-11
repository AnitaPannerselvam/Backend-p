package com.example.demo.controller;

import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.example.demo.model.ContactForm;
import com.example.demo.service.ContactFormService;

import java.util.List;

@RestController
@RequestMapping("/api/contact")
@CrossOrigin(origins = "https://localhost:5173")
public class ContactController {

    private final ContactFormService contactFormService;

    @Autowired
    public ContactController(ContactFormService contactFormService) {
        this.contactFormService = contactFormService;
    }

    @PostMapping
    public ResponseEntity<String> submitContactForm(@Valid @RequestBody ContactForm contactForm) {
        contactFormService.saveContactForm(contactForm);
        return ResponseEntity.status(HttpStatus.OK).body("Thank you for contacting us!");
    }

    @GetMapping
    public ResponseEntity<List<ContactForm>> getAllContactForms() {
        List<ContactForm> contactForms = contactFormService.getAllContactForms();
        return ResponseEntity.status(HttpStatus.OK).body(contactForms);
    }
}

