/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.detyra.test.ejb;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

import com.detyra.test.model.User;

/**
 *
 * @author ahasani
 */
@Stateless
public class LoginFacadeImpl implements LoginFacade {
    
    @PersistenceContext
    EntityManager em;
    
    @Override
    public String login(String username, String password) {
        TypedQuery<User> query = getEm().createQuery("SELECT u "
                + "From User u "
                + "Where u.username = :username "
                + "And u.password = :password", User.class);
        query.setParameter("username", username);
        query.setParameter("password", password);
        return !query.getResultList().isEmpty() ? "loginsuccess" : "loginerror";
    }

    public EntityManager getEm() {
        return em;
    }
      
}
