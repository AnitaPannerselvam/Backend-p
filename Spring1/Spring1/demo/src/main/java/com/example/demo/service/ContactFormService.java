package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.ContactForm;
import com.example.demo.repository.ContactFormRepository;

import java.util.List;

@Service
public class ContactFormService {

    private final ContactFormRepository contactFormRepository;

    @Autowired
    public ContactFormService(ContactFormRepository contactFormRepository) {
        this.contactFormRepository = contactFormRepository;
    }

    public ContactForm saveContactForm(ContactForm contactForm) {
        return contactFormRepository.save(contactForm);
    }

    public List<ContactForm> getAllContactForms() {
        return contactFormRepository.findAll();
    }
}
