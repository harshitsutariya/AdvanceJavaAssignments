package com.example.demo.model;

import com.fasterxml.jackson.annotation.JsonBackReference;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
public class Courses{

    @Id
    private int id;
    private String courseName;

    @ManyToMany(cascade = CascadeType.ALL,fetch = FetchType.LAZY,mappedBy = "courses")
    @JsonBackReference
    private Set<Student> students=new HashSet<>();

    public Courses(int id, String courseName) {
        this.id = id;
        this.courseName = courseName;
    }

    public Courses() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public  String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public Set<Student> getStudents() {
        return students;
    }

    public void setStudents(Set<Student> students) {
        this.students = students;
    }

    @Override
    public String toString() {
        return "Courses{" +
                "id=" + id;
    }
}
