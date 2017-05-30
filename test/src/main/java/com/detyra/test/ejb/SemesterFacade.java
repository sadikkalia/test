/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.detyra.test.ejb;

import com.detyra.test.model.Semester;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author ahasani
 */
@Stateless
public class SemesterFacade extends AbstractFacade<Semester> {

    @PersistenceContext(unitName = "com.detyra_test_war_1.0-SNAPSHOTPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public SemesterFacade() {
        super(Semester.class);
    }
    
}
