/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.detyra.test.controller;

import com.detyra.test.ejb.StudentFacade;
import com.detyra.test.model.Student;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.inject.Inject;

/**
 *
 * @author ahasani
 */
@ManagedBean(name = "studentController")
@ViewScoped
public class StudentControllerbak {
    
    @Inject
    StudentFacade facade;
    
    private Student student;
    private List<Student> students;
    private Student selected;
    
    @PostConstruct
    public void init() {
        this.students = facade.findAll();
        this.student = new Student();
    }
    
    public void create() {
        facade.create(student);
    }
    
    public void edit() {
        facade.edit(student);
    }
    
    public void remove() {
        facade.remove(student);
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    public List<Student> getStudents() {
        return students;
    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }

    public Student getSelected() {
        return selected;
    }

    public void setSelected(Student selected) {
        this.selected = selected;
    }
    
    
    
}
