package com.iba.persistance;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "hipotable")
public class HipoEntity implements Serializable {

	private static final long serialVersionUID = 1631753300971917487L;

	private String site;

	private String department;

	private String discipline;

	@Id
	@Column(name = "incidentnumber")
	private Long incidentNumber;

	private Date date;

	private String time;

	@Column(name = "incidentdescription")
	private String incidentDescription;

	@Column(name = "incidentdata")
	private String incidentData;

	@Column(name = "daysinmonth")
	private String daysInMonth;

	@Column(name = "corestaffhours")
	private String coreStaffHours;

	@Column(name = "overtimehours")
	private String overTimeHours;

	@Column(name = "actionplan")
	private String actionPlan;

	private String hipo;

	@Column(name = "bodyinjured")
	private String bodyInjured;

	private String environmental;

	private String occupational;

	public String getSite() {
		return site;
	}

	public void setSite(String site) {
		this.site = site;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public String getDiscipline() {
		return discipline;
	}

	public void setDiscipline(String discipline) {
		this.discipline = discipline;
	}

	public Long getIncidentNumber() {
		return incidentNumber;
	}

	public void setIncidentNumber(Long incidentNumber) {
		this.incidentNumber = incidentNumber;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public String getTime() {
		return time;
	}

	public void setTime(String time) {
		this.time = time;
	}

	public String getIncidentDescription() {
		return incidentDescription;
	}

	public void setIncidentDescription(String incidentDescription) {
		this.incidentDescription = incidentDescription;
	}

	public String getIncidentData() {
		return incidentData;
	}

	public void setIncidentData(String incidentData) {
		this.incidentData = incidentData;
	}

	public String getDaysInMonth() {
		return daysInMonth;
	}

	public void setDaysInMonth(String daysInMonth) {
		this.daysInMonth = daysInMonth;
	}

	public String getCoreStaffHours() {
		return coreStaffHours;
	}

	public void setCoreStaffHours(String coreStaffHours) {
		this.coreStaffHours = coreStaffHours;
	}

	public String getOverTimeHours() {
		return overTimeHours;
	}

	public void setOverTimeHours(String overTimeHours) {
		this.overTimeHours = overTimeHours;
	}

	public String getActionPlan() {
		return actionPlan;
	}

	public void setActionPlan(String actionPlan) {
		this.actionPlan = actionPlan;
	}

	public String getHipo() {
		return hipo;
	}

	public void setHipo(String hipo) {
		this.hipo = hipo;
	}

	public String getBodyInjured() {
		return bodyInjured;
	}

	public void setBodyInjured(String bodyInjured) {
		this.bodyInjured = bodyInjured;
	}

	public String getEnvironmental() {
		return environmental;
	}

	public void setEnvironmental(String environmental) {
		this.environmental = environmental;
	}

	public String getOccupational() {
		return occupational;
	}

	public void setOccupational(String occupational) {
		this.occupational = occupational;
	}

}
