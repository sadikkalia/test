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
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
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
    @NamedQuery(name = "Report.findAll", query = "SELECT r FROM Report r")})
public class Report implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "report_id")
    private Integer reportId;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 400)
    @Column(name = "report_description")
    private String reportDescription;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 400)
    @Column(name = "report_title")
    private String reportTitle;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 400)
    @Column(name = "report_class")
    private String reportClass;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 400)
    @Column(name = "report_author")
    private String reportAuthor;
    @Basic(optional = false)
    @NotNull
    @Column(name = "report_date")
    @Temporal(TemporalType.TIMESTAMP)
    private Date reportDate;
    @Basic(optional = false)
    @NotNull
    @Column(name = "id_module")
    private short idModule;
    @Basic(optional = false)
    @NotNull
    private boolean active;
    @Basic(optional = false)
    @NotNull
    @Column(name = "pos_in_group")
    private int posInGroup;
    @Basic(optional = false)
    @NotNull
    @Column(name = "id_report")
    private int idReport;

    public Report() {
    }

    public Report(Integer reportId) {
        this.reportId = reportId;
    }

    public Report(Integer reportId, String reportDescription, String reportTitle, String reportClass, String reportAuthor, Date reportDate, short idModule, boolean active, int posInGroup, int idReport) {
        this.reportId = reportId;
        this.reportDescription = reportDescription;
        this.reportTitle = reportTitle;
        this.reportClass = reportClass;
        this.reportAuthor = reportAuthor;
        this.reportDate = reportDate;
        this.idModule = idModule;
        this.active = active;
        this.posInGroup = posInGroup;
        this.idReport = idReport;
    }

    public Integer getReportId() {
        return reportId;
    }

    public void setReportId(Integer reportId) {
        this.reportId = reportId;
    }

    public String getReportDescription() {
        return reportDescription;
    }

    public void setReportDescription(String reportDescription) {
        this.reportDescription = reportDescription;
    }

    public String getReportTitle() {
        return reportTitle;
    }

    public void setReportTitle(String reportTitle) {
        this.reportTitle = reportTitle;
    }

    public String getReportClass() {
        return reportClass;
    }

    public void setReportClass(String reportClass) {
        this.reportClass = reportClass;
    }

    public String getReportAuthor() {
        return reportAuthor;
    }

    public void setReportAuthor(String reportAuthor) {
        this.reportAuthor = reportAuthor;
    }

    public Date getReportDate() {
        return reportDate;
    }

    public void setReportDate(Date reportDate) {
        this.reportDate = reportDate;
    }

    public short getIdModule() {
        return idModule;
    }

    public void setIdModule(short idModule) {
        this.idModule = idModule;
    }

    public boolean getActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    public int getPosInGroup() {
        return posInGroup;
    }

    public void setPosInGroup(int posInGroup) {
        this.posInGroup = posInGroup;
    }

    public int getIdReport() {
        return idReport;
    }

    public void setIdReport(int idReport) {
        this.idReport = idReport;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (reportId != null ? reportId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Report)) {
            return false;
        }
        Report other = (Report) object;
        if ((this.reportId == null && other.reportId != null) || (this.reportId != null && !this.reportId.equals(other.reportId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.detyra.test.Report[ reportId=" + reportId + " ]";
    }
    
}
