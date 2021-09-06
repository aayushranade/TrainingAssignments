package com.example.springcontact.configuration;

import com.example.springcontact.model.contactModel;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class contactConfig {
    @Bean
    public contactModel contactModelObj() {
        return new contactModel();
    }
}
