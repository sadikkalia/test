///*
// * To change this license header, choose License Headers in Project Properties.
// * To change this template file, choose Tools | Templates
// * and open the template in the editor.
// */
//package com.detyra.test.ejb;
//
//import com.detyra.test.model.Student;
//import javax.ejb.Stateless;
//import javax.persistence.EntityManager;
//import javax.persistence.PersistenceContext;
//
///**
// *
// * @author ahasani
// */
//@Stateless
//public class StudentFacadeImpl extends AbstractFacade<Student> implements StudentFacade{
//    
//    @PersistenceContext
//    EntityManager em;
//    
//    @Override
//    public EntityManager getEntityManager() {
//        return this.em;
//    }
//    
//    
//    public StudentFacadeImpl() {
//        super(Student.class);
//    }
//    
//}
