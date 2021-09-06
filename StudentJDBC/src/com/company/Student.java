package com.company;

public class Student {
    private String name;
    private String id;
    private String age;
    private String branch;

    public Student(String name, String id, String age, String branch) {
        this.name = name;
        this.id = id;
        this.age = age;
        this.branch = branch;
    }

    public String getName() {
        return name;
    }

    public String getId() {
        return id;
    }

    public String getAge(){
        return age;
    }

    public String getBranch() {
        return branch;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public void setBranch(String branch) {
        this.branch = branch;
    }

    /*@Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", course='" + course + '\'' +
                '}';
    }*/
}
