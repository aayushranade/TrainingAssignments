package com.company;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.sql.PreparedStatement;
import java.sql.Statement;

public class MySqlAccess {
    static String url="jdbc:mysql://localhost:3306/aayushdb";
    static String userName="root";
    static String pass="Login@251196";

    private Connection connect = null;
    private Statement statement = null;
    private PreparedStatement preparedStatement = null;
    private ResultSet resultSet = null;

    private String student_name;
    private String student_id;
    private String student_age;
    private String student_branch;

    public void databaseConnection() throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.cj.jdbc.Driver");
        connect = DriverManager
                .getConnection(url,userName,pass);
        if(connect!=null) {
            System.out.println("jdbc connected");
        }
        statement = connect.createStatement();
    }
    /*public List<Student> getStudents() {
        List<Student> students = new ArrayList<>();
        try {
            resultSet = statement
                    .executeQuery("select * from student");
            while (resultSet.next()) {
                student_name = resultSet.getString("name");
                student_id = resultSet.getString("id");
                student_age = resultSet.getString("age");
                student_branch = resultSet.getString("branch");
                Student student = new Student(student_name, student_id, student_age, student_branch);
                students.add(student);
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return students;
    }*/
    public Student getStudentById(String id) {
        try {
            resultSet = statement
                    .executeQuery("select * from aayushdb.students WHERE id= \'" + id + "\' LIMIT 1;");
            while (resultSet.next()) {
                student_name = resultSet.getString("name");
                student_id = resultSet.getString("id");
                student_age = resultSet.getString("age");
                student_branch = resultSet.getString("branch");
            }

        } catch (Exception e) {

        }
        return new Student(student_name, student_id, student_age, student_branch);
    }
    public void saveStudent(Student student) {
        try {
            preparedStatement = connect
                    .prepareStatement("insert into aayushdb.students values (?, ?, ?, ?)");
            preparedStatement.setString(1, student.getName());
            preparedStatement.setString(2, student.getId());
            preparedStatement.setString(3, student.getAge());
            preparedStatement.setString(4, student.getBranch());
            preparedStatement.executeUpdate();
        }
        catch (Exception e) {

        }

    }

    public void deleteStudent(String id) {
        try {
            preparedStatement = connect
                    .prepareStatement("delete from aayushdb.students where id= ? ; ");
            preparedStatement.setString(1, id);
            preparedStatement.executeUpdate();

        } catch (Exception e) {
            System.out.println(e.getMessage());

        }

    }

}

