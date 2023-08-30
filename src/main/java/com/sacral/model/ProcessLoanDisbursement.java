package com.sacral.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class ProcessLoanDisbursement {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;
	
	private String applicantDocuments;
	private String creditworthiness;
	private int loanAmount;
	private int interestRateRange;
	private String termsAndConditions;
	private int vehicleValue;
	private String disbursementTo;
	private String titleRetaining;
	private String accountPortal;
	private String latePaymentsAndDefaults;
	private String customerSupport;
	private String titleRelease;
	
	public ProcessLoanDisbursement() {}
	
	public ProcessLoanDisbursement(String applicantDocuments, String creditworthiness, int loanAmount, int interestRateRange,
			String termsAndConditions, int vehicleValue, String disbursementTo, String titleRetaining, String accountPortal,
			String latePaymentsAndDefaults, String customerSupport, String titleRelease) {
		this.applicantDocuments = applicantDocuments;
		this.creditworthiness = creditworthiness;
		this.loanAmount = loanAmount;
		this.interestRateRange = interestRateRange;
		this.termsAndConditions = termsAndConditions;
		this.vehicleValue = vehicleValue;
		this.disbursementTo = disbursementTo;
		this.titleRetaining = titleRetaining;
		this.accountPortal = accountPortal;
		this.latePaymentsAndDefaults = latePaymentsAndDefaults;
		this.customerSupport = customerSupport;
		this.titleRelease = titleRelease;
	}
	
	public Long getId() {
		return id;
	}
	
	public void setId(Long id) {
		this.id = id;
	}
	
	public String getApplicantDocuments() {
		return applicantDocuments;
	}
	
	public void setApplicantDocuments(String applicantDocuments) {
		this.applicantDocuments = applicantDocuments;
	}
	
	public String getCreditworthiness() {
		return creditworthiness;
	}
	
	public void setCreditworthiness(String creditworthiness) {
		this.creditworthiness = creditworthiness;
	}
	
	public int getLoanAmount() {
		return loanAmount;
	}
	
	public void setLoanAmount(int loanAmount) {
		this.loanAmount = loanAmount;
	}
	
	public int getInterestRateRange() {
		return interestRateRange;
	}
	
	public void setInterestRateRange(int interestRateRange) {
		this.interestRateRange = interestRateRange;
	}
	
	public String getTermsAndConditions() {
		return termsAndConditions;
	}
	
	public void setTermsAndConditions(String termsAndConditions) {
		this.termsAndConditions = termsAndConditions;
	}
	
	public int getVehicleValue() {
		return vehicleValue;
	}
	
	public void setVehicleValue(int vehicleValue) {
		this.vehicleValue = vehicleValue;
	}
	
	public String getDisbursementTo() {
		return disbursementTo;
	}
	
	public void setDisbursementTo(String disbursementTo) {
		this.disbursementTo = disbursementTo;
	}
	
	public String getTitleRetaining() {
		return titleRetaining;
	}
	
	public void setTitleRetaining(String titleRetaining) {
		this.titleRetaining = titleRetaining;
	}
	
	public String getAccountPortal() {
		return accountPortal;
	}
	
	public void setAccountPortal(String accountPortal) {
		this.accountPortal = accountPortal;
	}
	
	public String getLatePaymentsAndDefaults() {
		return latePayments