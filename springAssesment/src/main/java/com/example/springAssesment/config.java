package com.example.springAssesment;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

@Configuration
public class config {

    @Value("${spring.datasource.url}")
    String url;
    @Value("${spring.datasource.username}")
    String userName;
    @Value("${spring.datasource.password}")
    String pass;


    @Bean
    public model modelObj() {
        return new model();
    }
    @Bean
    public Connection connection() throws SQLException {
        Connection con= DriverManager.getConnection(url,userName,pass);
        return con;
    }
}
