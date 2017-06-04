/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.detyra.test.model;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
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
    @NamedQuery(name = "Department.findAll", query = "SELECT d FROM Department d")})
public class Department implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "department_id")
    private Integer departmentId;
    @Size(max = 100)
    @Column(name = "department_name")
    private String departmentName;
    @Size(max = 100)
    private String description;
    private Integer deleted;
    @Column(name = "system_date")
    @Temporal(TemporalType.TIMESTAMP)
    private Date systemDate;
    @JoinColumn(name = "id_head_of_department", referencedColumnName = "user_id")
    @ManyToOne
    private User idHeadOfDepartment;
    @JoinColumn(name = "id_user_created", referencedColumnName = "user_id")
    @ManyToOne
    private User idUserCreated;
    @JoinColumn(name = "id_faculty", referencedColumnName = "faculty_id")
    @ManyToOne
    private Faculty idFaculty;
    
    @OneToMany(mappedBy = "department")
    private List<Student> students;

    public Department() {
    }

    public Department(Integer departmentId) {
        this.departmentId = departmentId;
    }

    public Integer getDepartmentId() {
        return departmentId;
    }

    public void setDepartmentId(Integer departmentId) {
        this.departmentId = departmentId;
    }

    public String getDepartmentName() {
        return departmentName;
    }

    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
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

    public Date getSystemDate() {
        return systemDate;
    }

    public void setSystemDate(Date systemDate) {
        this.systemDate = systemDate;
    }

    public User getIdHeadOfDepartment() {
        return idHeadOfDepartment;
    }

    public void setIdHeadOfDepartment(User idHeadOfDepartment) {
        this.idHeadOfDepartment = idHeadOfDepartment;
    }

    public User getIdUserCreated() {
        return idUserCreated;
    }

    public void setIdUserCreated(User idUserCreated) {
        this.idUserCreated = idUserCreated;
    }

    public Faculty getIdFaculty() {
        return idFaculty;
    }

    public void setIdFaculty(Faculty idFaculty) {
        this.idFaculty = idFaculty;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (departmentId != null ? departmentId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Department)) {
            return false;
        }
        Department other = (Department) object;
        if ((this.departmentId == null && other.departmentId != null) || (this.departmentId != null && !this.departmentId.equals(other.departmentId))) {
            return false;
        }
        return true;
    }

    public List<Student> getStudents() {
        return students;
    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }
    
    

    @Override
    public String toString() {
        return departmentName;
    }
    
}
