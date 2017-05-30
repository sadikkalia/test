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
    @NamedQuery(name = "Semester.findAll", query = "SELECT s FROM Semester s")})
public class Semester implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "semester_id")
    private Integer semesterId;
    @Size(max = 100)
    @Column(name = "semester_name")
    private String semesterName;
    @Size(max = 100)
    private String description;
    @Column(name = "date_from")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dateFrom;
    @Column(name = "date_to")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dateTo;
    private Integer deleted;
    @Column(name = "system_date")
    @Temporal(TemporalType.TIMESTAMP)
    private Date systemDate;
    @Column(name = "semester_order")
    private Integer semesterOrder;
    @OneToMany(mappedBy = "idSemester")
    private Collection<ExamSeason> examSeasonCollection;
    @JoinColumn(name = "id_academic_year", referencedColumnName = "academic_year_id")
    @ManyToOne
    private AcademicYear idAcademicYear;
    @JoinColumn(name = "id_user_created", referencedColumnName = "user_id")
    @ManyToOne
    private User idUserCreated;

    public Semester() {
    }

    public Semester(Integer semesterId) {
        this.semesterId = semesterId;
    }

    public Integer getSemesterId() {
        return semesterId;
    }

    public void setSemesterId(Integer semesterId) {
        this.semesterId = semesterId;
    }

    public String getSemesterName() {
        return semesterName;
    }

    public void setSemesterName(String semesterName) {
        this.semesterName = semesterName;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Date getDateFrom() {
        return dateFrom;
    }

    public void setDateFrom(Date dateFrom) {
        this.dateFrom = dateFrom;
    }

    public Date getDateTo() {
        return dateTo;
    }

    public void setDateTo(Date dateTo) {
        this.dateTo = dateTo;
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

    public Integer getSemesterOrder() {
        return semesterOrder;
    }

    public void setSemesterOrder(Integer semesterOrder) {
        this.semesterOrder = semesterOrder;
    }

    public Collection<ExamSeason> getExamSeasonCollection() {
        return examSeasonCollection;
    }

    public void setExamSeasonCollection(Collection<ExamSeason> examSeasonCollection) {
        this.examSeasonCollection = examSeasonCollection;
    }

    public AcademicYear getIdAcademicYear() {
        return idAcademicYear;
    }

    public void setIdAcademicYear(AcademicYear idAcademicYear) {
        this.idAcademicYear = idAcademicYear;
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
        hash += (semesterId != null ? semesterId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Semester)) {
            return false;
        }
        Semester other = (Semester) object;
        if ((this.semesterId == null && other.semesterId != null) || (this.semesterId != null && !this.semesterId.equals(other.semesterId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.detyra.test.Semester[ semesterId=" + semesterId + " ]";
    }
    
}
