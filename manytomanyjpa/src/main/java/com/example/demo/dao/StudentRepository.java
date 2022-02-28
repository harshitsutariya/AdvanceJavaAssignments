package com.example.demo.dao;

import com.example.demo.model.Student;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface StudentRepository extends CrudRepository<Student,Integer> {

    @Query(value = "SELECT student.id,student.name,courses.course_name FROM ((student left join student_courses on student_courses.students_id=student.id)inner join courses on courses.id=student_courses.courses_id) where courses.course_name=?1",nativeQuery = true)
    List<Student> findAllByCourseName(@Param("?1") String courseName);
}

