package com.example.demo.controller;

import com.example.demo.model.Student;
import com.example.demo.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class StudentController {

    @Autowired
    private StudentService studentService;

    @PostMapping("/students")
    public void addStudent(){
        this.studentService.addStudent();
    }

    @GetMapping("/students")
    List<Student> viewStudent(){
        List<Student> list= this.studentService.findall();
        System.out.println(list);
        return list;
    }

    @GetMapping("/javastudents")
    public List<Student> getJavaStudents(){
        List<Student> list= this.studentService.findJavaStudent();

        return list;
    }

    @GetMapping("/pythonstudents")
    public List<Student> getPythonStudents(){
        List<Student> list= this.studentService.findPythonStudent();

        return list;
    }

    @GetMapping("/nebulastudents")
    public List<Student> getNebulaStudents(){
        List<Student> list= this.studentService.findNebulaStudent();

        return list;
    }

//
//    @GetMapping("javastudents")
//    public List<Student> getJavaStudent(){
//
//        List<Student> list= getStudents();
//
//        List<Student> list1=new ArrayList<>();
//
//        for (Student s:list){
//
//            Boolean b=s.getCourses().stream().anyMatch(c->c.getCourseName().equals("java"));
//
//            if(b){
//                list1.add(s);
//            }
//        }
//
//        return list1;
//    }
//
//    @GetMapping("pythonstudents")
//    public List<Student> getPythonStudent(){
//
//        List<Student> list= getStudents();
//
//        List<Student> list1=new ArrayList<>();
//
//        for (Student s:list){
//
//            Boolean b=s.getCourses().stream().anyMatch(c->c.getCourseName().equals("python"));
//
//            if(b){
//                list1.add(s);
//            }
//        }
//
//        return list1;
//    }
//
//    @GetMapping("nebulastudents")
//    @Modifying
//    @Query("select student.name where courses.courseName=java from c  ")
//    public void getNebulaStudent() {
//    }
//
////
////        List<Student> list= getStudents();
////
////        List<Student> list1=new ArrayList<>();
////
////        for (Student s:list){
////
////            Boolean b=s.getCourses().stream().anyMatch(c->c.getCourseName().equals("nebula"));
////
////            if(b){
////                list1.add(s);
////            }
////        }
////
////        return list1;
////    }




}
