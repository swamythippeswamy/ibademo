package com.iba.persistance;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "llindicators")
public class LLIndicatorEntity implements Serializable {

	private static final long serialVersionUID = -1225001699685622616L;

	@Id
	@Column(name = "llnumber")
	private Long llNumber;

	@Column(name = "llname")
	private String llName;

	@Column(name = "numoneq")
	private String numOneq;

	@Column(name = "numtwoq")
	private String numTwoq;

	@Column(name = "numthreeq")
	private String numThreeq;

	@Column(name = "numfourq")
	private String numFourq;

	@Column(name = "totaloneq")
	private String totalOneq;

	@Column(name = "totaltwoq")
	private String totalTwoq;

	@Column(name = "totalthreeq")
	private String totalThreeq;

	@Column(name = "totalfourq")
	private String totalFourq;

	@Column(name = "peroneq")
	private String perOneq;

	@Column(name = "pertwoq")
	private String perTwoq;

	@Column(name = "perthreeq")
	private String perThreeq;

	@Column(name = "perfourq")
	private String perFourq;

	public Long getLlNumber() {
		return llNumber;
	}

	public void setLlNumber(Long llNumber) {
		this.llNumber = llNumber;
	}

	public String getLlName() {
		return llName;
	}

	public void setLlName(String llName) {
		this.llName = llName;
	}

	public String getNumOneq() {
		return numOneq;
	}

	public void setNumOneq(String numOneq) {
		this.numOneq = numOneq;
	}

	public String getNumTwoq() {
		return numTwoq;
	}

	public void setNumTwoq(String numTwoq) {
		this.numTwoq = numTwoq;
	}

	public String getNumThreeq() {
		return numThreeq;
	}

	public void setNumThreeq(String numThreeq) {
		this.numThreeq = numThreeq;
	}

	public String getNumFourq() {
		return numFourq;
	}

	public void setNumFourq(String numFourq) {
		this.numFourq = numFourq;
	}

	public String getTotalOneq() {
		return totalOneq;
	}

	public void setTotalOneq(String totalOneq) {
		this.totalOneq = totalOneq;
	}

	public String getTotalTwoq() {
		return totalTwoq;
	}

	public void setTotalTwoq(String totalTwoq) {
		this.totalTwoq = totalTwoq;
	}

	public String getTotalThreeq() {
		return totalThreeq;
	}

	public void setTotalThreeq(String totalThreeq) {
		this.totalThreeq = totalThreeq;
	}

	public String getTotalFourq() {
		return totalFourq;
	}

	public void setTotalFourq(String totalFourq) {
		this.totalFourq = totalFourq;
	}

	public String getPerOneq() {
		return perOneq;
	}

	public void setPerOneq(String perOneq) {
		this.perOneq = perOneq;
	}

	public String getPerTwoq() {
		return perTwoq;
	}

	public void setPerTwoq(String perTwoq) {
		this.perTwoq = perTwoq;
	}

	public String getPerThreeq() {
		return perThreeq;
	}

	public void setPerThreeq(String perThreeq) {
		this.perThreeq = perThreeq;
	}

	public String getPerFourq() {
		return perFourq;
	}

	public void setPerFourq(String perFourq) {
		this.perFourq = perFourq;
	}

}
