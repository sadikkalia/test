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
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.faces.context.ExternalContext;
import javax.faces.context.FacesContext;
import javax.servlet.http.HttpSession;

/**
 *
 * @author ahasani
 */
@Stateless
public class LoginFacadeImpl implements LoginFacade {

    @PersistenceContext
    EntityManager em;

    @Override
    public void login(String username, String password) {
        TypedQuery<User> query = getEm().createQuery("SELECT u "
                + "From User u "
                + "Where u.username = :username "
                + "And u.password = :password", User.class);
        query.setParameter("username", username);
        query.setParameter("password", password);

        FacesContext context = FacesContext.getCurrentInstance();
        ExternalContext ec = context.getExternalContext();
        try {
            if (query.getResultList().isEmpty()) {

                ec.redirect(ec.getRequestContextPath() + "/login.xhtml");

            } else {

                HttpSession session = (HttpSession) ec.getSession(false);
                session.setAttribute("user", username);
                ec.redirect(ec.getRequestContextPath() + "/index.xhtml");
            }
        } catch (IOException ex) {
            Logger.getLogger(LoginFacadeImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public EntityManager getEm() {
        return em;
    }

    @Override
    public void logout() {
        FacesContext context = FacesContext.getCurrentInstance();
        ExternalContext ec = context.getExternalContext();
        HttpSession session = (HttpSession) ec.getSession(false);
        session.invalidate();
        try {
            ec.redirect(ec.getRequestContextPath() + "/index.xhtml");
        } catch (IOException ex) {
            Logger.getLogger(LoginFacadeImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}
