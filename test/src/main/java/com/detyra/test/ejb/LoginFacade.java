/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.detyra.test.ejb;

import com.detyra.test.model.User;

/**
 *
 * @author ahasani
 */
public interface LoginFacade {
    public void login(String username, String password);
    public void logout();
}
