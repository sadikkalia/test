/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.detyra.test.controller;

import com.detyra.test.ejb.LoginFacade;
import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

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

    public void login() {
    	getFacade().login(username, password);
    }
    
    public void logout() {
        getFacade().logout();
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
