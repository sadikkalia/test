/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.detyra.test.model;

import java.io.Serializable;
import java.util.Collection;
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
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.Size;

/**
 *
 * @author ahasani
 */
@Entity
@Table(name = "academic_year")
@NamedQueries({
    @NamedQuery(name = "AcademicYear.findAll", query = "SELECT a FROM AcademicYear a")})
public class AcademicYear implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "academic_year_id")
    private Integer academicYearId;
    @Column(name = "date_from")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dateFrom;
    @Column(name = "date_to")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dateTo;
    private Integer deleted;
    @Size(max = 1000)
    private String description;
    @Column(name = "system_date")
    @Temporal(TemporalType.TIMESTAMP)
    private Date systemDate;
    @OneToMany(mappedBy = "idAcademicYear")
    private Collection<ExamSeason> examSeasonCollection;
    @JoinColumn(name = "id_user_created", referencedColumnName = "user_id")
    @ManyToOne
    private User idUserCreated;
    @OneToMany(mappedBy = "idAcademicYear")
    private Collection<Semester> semesterCollection;
    
    @OneToMany(mappedBy = "academicYear")
    private List<Student> students;

    public AcademicYear() {
    }

    public AcademicYear(Integer academicYearId) {
        this.academicYearId = academicYearId;
    }

    public Integer getAcademicYearId() {
        return academicYearId;
    }

    public void setAcademicYearId(Integer academicYearId) {
        this.academicYearId = academicYearId;
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

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Date getSystemDate() {
        return systemDate;
    }

    public void setSystemDate(Date systemDate) {
        this.systemDate = systemDate;
    }

    public Collection<ExamSeason> getExamSeasonCollection() {
        return examSeasonCollection;
    }

    public void setExamSeasonCollection(Collection<ExamSeason> examSeasonCollection) {
        this.examSeasonCollection = examSeasonCollection;
    }

    public User getIdUserCreated() {
        return idUserCreated;
    }

    public void setIdUserCreated(User idUserCreated) {
        this.idUserCreated = idUserCreated;
    }

    public Collection<Semester> getSemesterCollection() {
        return semesterCollection;
    }

    public void setSemesterCollection(Collection<Semester> semesterCollection) {
        this.semesterCollection = semesterCollection;
    }

    public List<Student> getStudents() {
        return students;
    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }
    
    

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (academicYearId != null ? academicYearId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof AcademicYear)) {
            return false;
        }
        AcademicYear other = (AcademicYear) object;
        if ((this.academicYearId == null && other.academicYearId != null) || (this.academicYearId != null && !this.academicYearId.equals(other.academicYearId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return description;
    }
    
}
