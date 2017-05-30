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
import javax.validation.constraints.Size;

/**
 *
 * @author ahasani
 */
@Entity
@Table(name = "exam_season")
@NamedQueries({
    @NamedQuery(name = "ExamSeason.findAll", query = "SELECT e FROM ExamSeason e")})
public class ExamSeason implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "exam_season_id")
    private Integer examSeasonId;
    @Size(max = 100)
    @Column(name = "season_name")
    private String seasonName;
    @Column(name = "date_from")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dateFrom;
    @Column(name = "date_to")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dateTo;
    @Size(max = 100)
    private String description;
    private Integer deleted;
    @Column(name = "is_regular")
    private Integer isRegular;
    @Column(name = "system_date")
    @Temporal(TemporalType.TIMESTAMP)
    private Date systemDate;
    @JoinColumn(name = "id_academic_year", referencedColumnName = "academic_year_id")
    @ManyToOne
    private AcademicYear idAcademicYear;
    @JoinColumn(name = "id_semester", referencedColumnName = "semester_id")
    @ManyToOne
    private Semester idSemester;
    @JoinColumn(name = "id_user_created", referencedColumnName = "user_id")
    @ManyToOne
    private User idUserCreated;

    public ExamSeason() {
    }

    public ExamSeason(Integer examSeasonId) {
        this.examSeasonId = examSeasonId;
    }

    public Integer getExamSeasonId() {
        return examSeasonId;
    }

    public void setExamSeasonId(Integer examSeasonId) {
        this.examSeasonId = examSeasonId;
    }

    public String getSeasonName() {
        return seasonName;
    }

    public void setSeasonName(String seasonName) {
        this.seasonName = seasonName;
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

    public Integer getIsRegular() {
        return isRegular;
    }

    public void setIsRegular(Integer isRegular) {
        this.isRegular = isRegular;
    }

    public Date getSystemDate() {
        return systemDate;
    }

    public void setSystemDate(Date systemDate) {
        this.systemDate = systemDate;
    }

    public AcademicYear getIdAcademicYear() {
        return idAcademicYear;
    }

    public void setIdAcademicYear(AcademicYear idAcademicYear) {
        this.idAcademicYear = idAcademicYear;
    }

    public Semester getIdSemester() {
        return idSemester;
    }

    public void setIdSemester(Semester idSemester) {
        this.idSemester = idSemester;
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
        hash += (examSeasonId != null ? examSeasonId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ExamSeason)) {
            return false;
        }
        ExamSeason other = (ExamSeason) object;
        if ((this.examSeasonId == null && other.examSeasonId != null) || (this.examSeasonId != null && !this.examSeasonId.equals(other.examSeasonId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.detyra.test.ExamSeason[ examSeasonId=" + examSeasonId + " ]";
    }
    
}
