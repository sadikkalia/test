/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.detyra.test.model;

import java.io.Serializable;
import java.math.BigInteger;
import java.util.Collection;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 *
 * @author ahasani
 */
@Entity
@NamedQueries({
    @NamedQuery(name = "User.findAll", query = "SELECT u FROM User u")})
public class User implements Serializable {

    private static final long serialVersionUID = 1L;
    @Size(max = 400)
    private String name;
    @Size(max = 400)
    private String surname;
    @Column(name = "id_role")
    private BigInteger idRole;
    @Temporal(TemporalType.DATE)
    private Date created;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "user_id")
    private Integer userId;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 100)
    private String username;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 100)
    private String password;
    @Basic(optional = false)
    @NotNull
    private boolean deleted;
    @Size(max = 400)
    private String role;
    @Size(max = 400)
    private String avatar;
    private Short status;
    @Size(max = 400)
    private String statusmsg;
    // @Pattern(regexp="[a-z0-9!#$%&'*+/=?^_`{|}~-]+(?:\\.[a-z0-9!#$%&'*+/=?^_`{|}~-]+)*@(?:[a-z0-9](?:[a-z0-9-]*[a-z0-9])?\\.)+[a-z0-9](?:[a-z0-9-]*[a-z0-9])?", message="Invalid email")//if the field contains email address consider using this annotation to enforce field validation
    @Size(max = 45)
    private String email;
    @Size(max = 100)
    @Column(name = "user_code")
    private String userCode;
    @OneToMany(mappedBy = "idUserCreated")
    private Collection<ExamSeason> examSeasonCollection;
    @OneToMany(mappedBy = "idUserCreated")
    private Collection<Subject> subjectCollection;
    @OneToMany(mappedBy = "idUserCreated")
    private Collection<University> universityCollection;
    @OneToMany(mappedBy = "idUserCreated")
    private Collection<FacultyCourse> facultyCourseCollection;
    @OneToMany(mappedBy = "idUserCreated")
    private Collection<AcademicYear> academicYearCollection;
    @OneToMany(mappedBy = "idUserCreated")
    private Collection<Course> courseCollection;
    @OneToMany(mappedBy = "idUserCreated")
    private Collection<Semester> semesterCollection;
    @OneToMany(mappedBy = "idHeadOfDepartment")
    private Collection<Department> departmentCollection;
    @OneToMany(mappedBy = "idUserCreated")
    private Collection<Department> departmentCollection1;

    public User() {
    }

    public User(Integer userId) {
        this.userId = userId;
    }

    public User(Integer userId, String username, String password, boolean deleted) {
        this.userId = userId;
        this.username = username;
        this.password = password;
        this.deleted = deleted;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public BigInteger getIdRole() {
        return idRole;
    }

    public void setIdRole(BigInteger idRole) {
        this.idRole = idRole;
    }

    public Date getCreated() {
        return created;
    }

    public void setCreated(Date created) {
        this.created = created;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
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

    public boolean getDeleted() {
        return deleted;
    }

    public void setDeleted(boolean deleted) {
        this.deleted = deleted;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public String getAvatar() {
        return avatar;
    }

    public void setAvatar(String avatar) {
        this.avatar = avatar;
    }

    public Short getStatus() {
        return status;
    }

    public void setStatus(Short status) {
        this.status = status;
    }

    public String getStatusmsg() {
        return statusmsg;
    }

    public void setStatusmsg(String statusmsg) {
        this.statusmsg = statusmsg;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getUserCode() {
        return userCode;
    }

    public void setUserCode(String userCode) {
        this.userCode = userCode;
    }

    public Collection<ExamSeason> getExamSeasonCollection() {
        return examSeasonCollection;
    }

    public void setExamSeasonCollection(Collection<ExamSeason> examSeasonCollection) {
        this.examSeasonCollection = examSeasonCollection;
    }

    public Collection<Subject> getSubjectCollection() {
        return subjectCollection;
    }

    public void setSubjectCollection(Collection<Subject> subjectCollection) {
        this.subjectCollection = subjectCollection;
    }

    public Collection<University> getUniversityCollection() {
        return universityCollection;
    }

    public void setUniversityCollection(Collection<University> universityCollection) {
        this.universityCollection = universityCollection;
    }

    public Collection<FacultyCourse> getFacultyCourseCollection() {
        return facultyCourseCollection;
    }

    public void setFacultyCourseCollection(Collection<FacultyCourse> facultyCourseCollection) {
        this.facultyCourseCollection = facultyCourseCollection;
    }

    public Collection<AcademicYear> getAcademicYearCollection() {
        return academicYearCollection;
    }

    public void setAcademicYearCollection(Collection<AcademicYear> academicYearCollection) {
        this.academicYearCollection = academicYearCollection;
    }

    public Collection<Course> getCourseCollection() {
        return courseCollection;
    }

    public void setCourseCollection(Collection<Course> courseCollection) {
        this.courseCollection = courseCollection;
    }

    public Collection<Semester> getSemesterCollection() {
        return semesterCollection;
    }

    public void setSemesterCollection(Collection<Semester> semesterCollection) {
        this.semesterCollection = semesterCollection;
    }

    public Collection<Department> getDepartmentCollection() {
        return departmentCollection;
    }

    public void setDepartmentCollection(Collection<Department> departmentCollection) {
        this.departmentCollection = departmentCollection;
    }

    public Collection<Department> getDepartmentCollection1() {
        return departmentCollection1;
    }

    public void setDepartmentCollection1(Collection<Department> departmentCollection1) {
        this.departmentCollection1 = departmentCollection1;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (userId != null ? userId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof User)) {
            return false;
        }
        User other = (User) object;
        if ((this.userId == null && other.userId != null) || (this.userId != null && !this.userId.equals(other.userId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.detyra.test.User[ userId=" + userId + " ]";
    }
    
}
