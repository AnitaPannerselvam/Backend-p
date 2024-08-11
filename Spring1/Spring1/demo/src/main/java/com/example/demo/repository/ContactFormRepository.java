package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.model.ContactForm;

@Repository
public interface ContactFormRepository extends JpaRepository<ContactForm, Long> {
    // Additional query methods can be defined here if needed
}

