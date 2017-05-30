/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.detyra.test.model;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author ahasani
 */
@Entity
@Table(name = "faculty_course")
@NamedQueries({
    @NamedQuery(name = "FacultyCourse.findAll", query = "SELECT f FROM FacultyCourse f")})
public class FacultyCourse implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "faculty_course_id")
    private Integer facultyCourseId;
    private Integer deleted;
    @Column(name = "system_date")
    @Temporal(TemporalType.TIMESTAMP)
    private Date systemDate;
    private Integer credits;
    @JoinColumn(name = "id_course", referencedColumnName = "course_id")
    @ManyToOne
    private Course idCourse;
    @JoinColumn(name = "id_faculty", referencedColumnName = "faculty_id")
    @ManyToOne
    private Faculty idFaculty;
    @JoinColumn(name = "id_user_created", referencedColumnName = "user_id")
    @ManyToOne
    private User idUserCreated;

    public FacultyCourse() {
    }

    public FacultyCourse(Integer facultyCourseId) {
        this.facultyCourseId = facultyCourseId;
    }

    public Integer getFacultyCourseId() {
        return facultyCourseId;
    }

    public void setFacultyCourseId(Integer facultyCourseId) {
        this.facultyCourseId = facultyCourseId;
    }

    public Integer getDeleted() {
        return deleted;
    }

    public void setDeleted(Integer deleted) {
        this.deleted = deleted;
    }

    public Date getSystemDate() {
        return systemDate;
    }

    public void setSystemDate(Date systemDate) {
        this.systemDate = systemDate;
    }

    public Integer getCredits() {
        return credits;
    }

    public void setCredits(Integer credits) {
        this.credits = credits;
    }

    public Course getIdCourse() {
        return idCourse;
    }

    public void setIdCourse(Course idCourse) {
        this.idCourse = idCourse;
    }

    public Faculty getIdFaculty() {
        return idFaculty;
    }

    public void setIdFaculty(Faculty idFaculty) {
        this.idFaculty = idFaculty;
    }

    public User getIdUserCreated() {
        return idUserCreated;
    }

    public void setIdUserCreated(User idUserCreated) {
        this.idUserCreated = idUserCreated;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (facultyCourseId != null ? facultyCourseId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof FacultyCourse)) {
            return false;
        }
        FacultyCourse other = (FacultyCourse) object;
        if ((this.facultyCourseId == null && other.facultyCourseId != null) || (this.facultyCourseId != null && !this.facultyCourseId.equals(other.facultyCourseId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.detyra.test.FacultyCourse[ facultyCourseId=" + facultyCourseId + " ]";
    }
    
}
