package com.example.springContactBook.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import org.springframework.jdbc.core.JdbcTemplate;

@Repository
public class FriendlistRepository {

    @Autowired
    JdbcTemplate jdbcTemplate;

    public void insertNewFriendToDatabase(String firstname, String lastname, String phoneno, String email) {
        String sql = "INSERT INTO friend(firstname,lastname,phoneno,email) VALUES(?,?,?,?)";
        Object params[] = new Object[] {firstname, lastname, phoneno, email };
        jdbcTemplate.update(sql,params);
        System.out.println("Friend successfully added!");
    }
}
