package com.example.demo.service;

import com.example.demo.dao.StudentRepository;
import com.example.demo.model.Courses;
import com.example.demo.model.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService implements com.example.demo.service.Service {

    @Autowired
    private StudentRepository studentRepository;

    public void addStudent() {

        Student student = new Student(3, "shivam");

        Courses courses = new Courses(25, "data science");
        Courses courses1 = new Courses(63, "python");


        student.getCourses().add(courses);
        student.getCourses().add(courses1);

        courses.getStudents().add(student);
        courses1.getStudents().add(student);

        this.studentRepository.save(student);
    }

    public List<Student> findall(){
        List<Student> list = (List<Student>) this.studentRepository.findAll();
        return list;
    }

    public List<Student> findJavaStudent(){
        List<Student> list=this.studentRepository.findAllByCourseName("python");
        return list;
    }
}
