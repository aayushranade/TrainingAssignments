package com.company;

import java.sql.SQLException;
import java.util.Scanner;

public class Main {
        public static void main(String[] args) throws SQLException, ClassNotFoundException {

            MySqlAccess dbs = new MySqlAccess();
            //Creates a database connection
            System.out.println("Creating Database Connection");
            dbs.databaseConnection();

            Scanner in = new Scanner(System.in);

            System.out.println("Please select from the menu ");
            System.out.println("1. Add a record");
            System.out.println("2. Search by ID");
            System.out.println("3. Delete a record");

            int Choice=in.nextInt();
            in.nextLine();

            switch(Choice){
                case 1:
                    System.out.println("Feeding static details for trial");
                    Student Aayush = new Student("Aayush Ranade", "1", "24", "IT");
                    Student Dev = new Student("Dev", "2","31", "Mech");
                    dbs.saveStudent(Aayush);
                    dbs.saveStudent(Dev);
                    break;

                case 2:
                    System.out.println("Static search for trial");
                    System.out.println("Getting the students by id");
                    Student student = dbs.getStudentById("1");
                    System.out.println(student.toString());
                    break;

                case 3:
                    System.out.println("Static delete for trial");
                    System.out.println("Deleting a student from the database");
                    dbs.deleteStudent("1");
                    break;

                default:
                    break;
            }

    }

}
