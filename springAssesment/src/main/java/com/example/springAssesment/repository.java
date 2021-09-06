package com.example.springAssesment;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

@Repository
public class repository {

//    @Autowired
//    Connection con;
//
//    Statement stm=null;

    @Autowired
    JdbcTemplate jdbcTemplate;

    details detail=new details();

    public void insertNewDetailsToDatabase(String name, String id, String companyname) {
        String sql = "INSERT INTO aayushdb.details(name,id,companyname) VALUES(?,?,?)";
        Object params[] = new Object[] {name,id,companyname};
        jdbcTemplate.update(sql,params);
        System.out.println("Friend sucessfully added!");
    }

    public void insertNewDetailsToDatabaseJson(details detail) {
        String sql = "INSERT INTO aayushdb.details(name,id,companyname) VALUES(?,?,?)";
        Object params[] = new Object[] {detail.getName(),detail.getId(),detail.getCompanyname()};
        jdbcTemplate.update(sql,params);
    }
//    public details readData(String id) throws SQLException {
//        String sql="select * from aayushdb.details where id='"+id+"'";
//        ResultSet res= stm.executeQuery(sql);
//        while(res.next()){
//
//            detail.setCompanyname(res.getString(1));
//            detail.setId(res.getString(2));
//            detail.setName(res.getString(3));
//            System.out.println(res.getString(1));
//
//        }
//
//        return  detail;
//    }
}