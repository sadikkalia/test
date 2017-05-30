/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.detyra.test.model;

import java.io.Serializable;
import java.math.BigInteger;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;

/**
 *
 * @author ahasani
 */
@Entity
@NamedQueries({
    @NamedQuery(name = "Rolerights.findAll", query = "SELECT r FROM Rolerights r")})
public class Rolerights implements Serializable {

    private static final long serialVersionUID = 1L;
    @Column(name = "id_role")
    private BigInteger idRole;
    @Column(name = "id_right")
    private BigInteger idRight;
    private BigInteger access;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "rolerights_id")
    private Integer rolerightsId;

    public Rolerights() {
    }

    public Rolerights(Integer rolerightsId) {
        this.rolerightsId = rolerightsId;
    }

    public BigInteger getIdRole() {
        return idRole;
    }

    public void setIdRole(BigInteger idRole) {
        this.idRole = idRole;
    }

    public BigInteger getIdRight() {
        return idRight;
    }

    public void setIdRight(BigInteger idRight) {
        this.idRight = idRight;
    }

    public BigInteger getAccess() {
        return access;
    }

    public void setAccess(BigInteger access) {
        this.access = access;
    }

    public Integer getRolerightsId() {
        return rolerightsId;
    }

    public void setRolerightsId(Integer rolerightsId) {
        this.rolerightsId = rolerightsId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (rolerightsId != null ? rolerightsId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Rolerights)) {
            return false;
        }
        Rolerights other = (Rolerights) object;
        if ((this.rolerightsId == null && other.rolerightsId != null) || (this.rolerightsId != null && !this.rolerightsId.equals(other.rolerightsId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.detyra.test.Rolerights[ rolerightsId=" + rolerightsId + " ]";
    }
    
}
