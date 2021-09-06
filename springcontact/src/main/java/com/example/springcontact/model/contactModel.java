package com.example.springcontact.model;

import com.example.springcontact.repository.contactRepository;
import org.springframework.beans.factory.annotation.Autowired;

public class contactModel {
    @Autowired
    com.example.springcontact.repository.contactRepository contactRepository;
}
