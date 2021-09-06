package com.example.springcontact.repository;

import com.example.springcontact.model.friend;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class contactRepository {

    @Autowired
    JdbcTemplate jdbcTemplate;

    public void insertNewFriendToDatabase(String phoneno, String name, String email) {
        String sql = "INSERT INTO aayushdb.spring(phoneno,name,email) VALUES(?,?,?)";
        Object params[] = new Object[] {phoneno,name,email};
        jdbcTemplate.update(sql,params);
    }

    public friend getFriendFromDatabase(String phoneno) {
        String sql = "SELECT * FROM aayushdb.spring WHERE phoneno = ?";
        Object params[] = new Object[] {phoneno};
        return jdbcTemplate.queryForObject(sql, params, BeanPropertyRowMapper.newInstance(friend.class));
    }

    public void updateNewFriendToDatabase(String email, String phoneno){
        String sql = "UPDATE aayushdb.spring SET email=? WHERE phoneno=? ";
        Object params[] = new Object[] {email,phoneno};
        jdbcTemplate.update(sql,params);
    }

    public void delFriendFromDatabase(String phoneno){
        String sql = "DELETE FROM aayushdb.spring WHERE phoneno =?";
        Object params[]= new Object[] {phoneno};
        jdbcTemplate.update(sql,params);
    }
}
