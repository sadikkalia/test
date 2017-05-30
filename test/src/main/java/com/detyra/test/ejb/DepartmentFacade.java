/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.detyra.test.ejb;

import com.detyra.test.model.Department;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author ahasani
 */
@Stateless
public class DepartmentFacade extends AbstractFacade<Department> {

    @PersistenceContext(unitName = "com.detyra_test_war_1.0-SNAPSHOTPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public DepartmentFacade() {
        super(Department.class);
    }
    
}
