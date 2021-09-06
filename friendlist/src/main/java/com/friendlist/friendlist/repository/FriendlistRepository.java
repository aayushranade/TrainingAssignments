package com.friendlist.friendlist.repository;

import com.friendlist.friendlist.model.Friend;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;

@Repository
public class FriendlistRepository {
    
    @Autowired
    JdbcTemplate jdbcTemplate;

    public void insertNewFriendToDatabase(String firstname, String lastname, String phoneno, String email) {
        String sql = "INSERT INTO aayushdb.friend(firstname,lastname,phoneno,email) VALUES(?,?,?,?)";
        Object params[] = new Object[] {firstname, lastname, phoneno, email};
        jdbcTemplate.update(sql,params);
        System.out.println("Friend sucessfully added!");
    }

    public Friend getFriendFromDatabase(String phoneno) {
        String sql = "SELECT * FROM aayushdb.friend WHERE phoneno = ?";
        Object params[] = new Object[] {phoneno};
        return jdbcTemplate.queryForObject(sql, params, BeanPropertyRowMapper.newInstance(Friend.class));
    }

    public boolean delFriendFromDatabase(String phoneno){
        String sql = "DELETE FROM aayushdb.friend WHERE phoneno =?";
        Object params[]= new Object[] {phoneno};
        return jdbcTemplate.update(sql,params) == 1;
    }

    public Friend updateNewFriendToDatabase(String phonenoToUpd, String emailToUpd){
        String sql = "UPDATE aayushdb.friend SET email=? WHERE phoneno=? ";
        Object params[] = new Object[] {emailToUpd,phonenoToUpd};
        jdbcTemplate.update(sql,params);
        return null;
    }

}