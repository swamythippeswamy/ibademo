package com.iba.model;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class LLIndicator implements Serializable {

	private static final long serialVersionUID = 8002774125031847561L;

	private Long llNumber;

	private String llName;

	private String numOneq;

	private String numTwoq;

	private String numThreeq;

	private String numFourq;

	private String totalOneq;

	private String totalTwoq;

	private String totalThreeq;

	private String totalFourq;

	private String perOneq;

	private String perTwoq;

	private String perThreeq;

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
