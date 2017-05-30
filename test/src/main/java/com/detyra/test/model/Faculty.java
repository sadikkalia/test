/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.detyra.test.model;

import java.io.Serializable;
import java.util.Collection;
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
import javax.persistence.OneToMany;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.Size;

/**
 *
 * @author ahasani
 */
@Entity
@NamedQueries({
    @NamedQuery(name = "Faculty.findAll", query = "SELECT f FROM Faculty f")})
public class Faculty implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "faculty_id")
    private Integer facultyId;
    @Size(max = 100)
    @Column(name = "faculty_name")
    private String facultyName;
    @Size(max = 100)
    private String description;
    private Integer deleted;
    @Column(name = "id_user_created")
    private Integer idUserCreated;
    @Column(name = "system_date")
    @Temporal(TemporalType.TIMESTAMP)
    private Date systemDate;
    @Column(name = "id_dean")
    private Integer idDean;
    @Column(name = "id_vice_dean")
    private Integer idViceDean;
    @OneToMany(mappedBy = "idFaculty")
    private Collection<FacultyCourse> facultyCourseCollection;
    @JoinColumn(name = "id_university", referencedColumnName = "university_id")
    @ManyToOne
    private University idUniversity;
    @OneToMany(mappedBy = "idFaculty")
    private Collection<Course> courseCollection;
    @OneToMany(mappedBy = "idFaculty")
    private Collection<Department> departmentCollection;

    public Faculty() {
    }

    public Faculty(Integer facultyId) {
        this.facultyId = facultyId;
    }

    public Integer getFacultyId() {
        return facultyId;
    }

    public void setFacultyId(Integer facultyId) {
        this.facultyId = facultyId;
    }

    public String getFacultyName() {
        return facultyName;
    }

    public void setFacultyName(String facultyName) {
        this.facultyName = facultyName;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Integer getDeleted() {
        return deleted;
    }

    public void setDeleted(Integer deleted) {
        this.deleted = deleted;
    }

    public Integer getIdUserCreated() {
        return idUserCreated;
    }

    public void setIdUserCreated(Integer idUserCreated) {
        this.idUserCreated = idUserCreated;
    }

    public Date getSystemDate() {
        return systemDate;
    }

    public void setSystemDate(Date systemDate) {
        this.systemDate = systemDate;
    }

    public Integer getIdDean() {
        return idDean;
    }

    public void setIdDean(Integer idDean) {
        this.idDean = idDean;
    }

    public Integer getIdViceDean() {
        return idViceDean;
    }

    public void setIdViceDean(Integer idViceDean) {
        this.idViceDean = idViceDean;
    }

    public Collection<FacultyCourse> getFacultyCourseCollection() {
        return facultyCourseCollection;
    }

    public void setFacultyCourseCollection(Collection<FacultyCourse> facultyCourseCollection) {
        this.facultyCourseCollection = facultyCourseCollection;
    }

    public University getIdUniversity() {
        return idUniversity;
    }

    public void setIdUniversity(University idUniversity) {
        this.idUniversity = idUniversity;
    }

    public Collection<Course> getCourseCollection() {
        return courseCollection;
    }

    public void setCourseCollection(Collection<Course> courseCollection) {
        this.courseCollection = courseCollection;
    }

    public Collection<Department> getDepartmentCollection() {
        return departmentCollection;
    }

    public void setDepartmentCollection(Collection<Department> departmentCollection) {
        this.departmentCollection = departmentCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (facultyId != null ? facultyId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Faculty)) {
            return false;
        }
        Faculty other = (Faculty) object;
        if ((this.facultyId == null && other.facultyId != null) || (this.facultyId != null && !this.facultyId.equals(other.facultyId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.detyra.test.Faculty[ facultyId=" + facultyId + " ]";
    }
    
}
