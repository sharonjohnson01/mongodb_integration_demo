package com.example.demo.service;

import com.example.demo.model.Student;

import java.util.ArrayList;
import java.util.List;

public class StudentServiceImpl implements StudentService{


    @Override
    public List<Student> findAll() {
        Student student = new Student();
        student.setCourseList(new ArrayList<>());
        return null;
    }

    @Override
    public Student findByStudentNumber(long studentNumber) {
        return null;
    }

    @Override
    public Student findByEmail(String email) {
        return null;
    }

    @Override
    public List<Student> findAllByOrderByGpa() {
        return null;
    }

    @Override
    public void saveOrUpdateStudent(Student student) {

    }

    @Override
    public void deleteStudent(String id) {

    }
}
