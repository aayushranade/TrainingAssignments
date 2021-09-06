package com.company;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Main {
    static String url="jdbc:mysql://localhost:3306/aayushdb";
    static String userName="root";
    static String pass="Login@251196";

    public static void main(String[] args) {
        Connection con=null;
        Statement stm=null;
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            con= DriverManager.getConnection(url,userName,pass);
            if(con!=null) {
                System.out.println("jdbc connected");
            }
            stm=con.createStatement();
            String sql="select * from student";
            ResultSet rs=stm.executeQuery(sql);
            System.out.println(rs);
            while (rs.next()){
                System.out.println("Name:" + rs.getString(1) +" " + "Age:" + rs.getString(2));
            }
        }
        catch (Exception ignored){

        }

    }
}
