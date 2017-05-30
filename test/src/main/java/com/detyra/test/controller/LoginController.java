/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.detyra.test.controller;

import com.detyra.test.ejb.LoginFacade;
import javax.ejb.EJB;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.context.FacesContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;

/**
 *
 * @author ahasani
 */
@ManagedBean(name = "loginBean")
@RequestScoped
public class LoginController {

    @EJB
    private LoginFacade facade;

    private String username;
    private String password;

    public LoginController() {
    }

    public String login() {

        /*FacesContext context = FacesContext.getCurrentInstance();
        HttpServletRequest request = (HttpServletRequest) context.getExternalContext().getRequest();

        if (request.getUserPrincipal() != null) {
            return "loginsuccess";
        }

        try {
            request.login(username, password);
        } catch (ServletException e) {
            context.addMessage(null, new FacesMessage("Login failed."));
            return "/loginerror.xhtml?faces-redirect=true";
        }

        return "loginsuccess";*/
    	
    	return getFacade().login(username, password);
    	
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public LoginFacade getFacade() {
        return facade;
    }

}
