package com.sacral.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class UserStory {
	
	@Id
	private int userId;
	private String name;
	private String identity;
	private String address;
	private int annualIncome;
	private int creditScore;
	private int disbursedAmount;
	private int vehicleAssessmentValue;
	private int paymentAmount;
	private String vendorName;
	
	public UserStory() {
		
	}
	
	public UserStory(int userId, String name, String identity, String address, int annualIncome, int creditScore,
			int disbursedAmount, int vehicleAssessmentValue, int paymentAmount, String vendorName) {
		super();
		this.userId = userId;
		this.name = name;
		this.identity = identity;
		this.address = address;
		this.annualIncome = annualIncome;
		this.creditScore = creditScore;
		this.disbursedAmount = disbursedAmount;
		this.vehicleAssessmentValue = vehicleAssessmentValue;
		this.paymentAmount = paymentAmount;
		this.vendorName = vendorName;
	}
	
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getIdentity() {
		return identity;
	}
	public void setIdentity(String identity) {
		this.identity = identity;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public int getAnnualIncome() {
		return annualIncome;
	}
	public void setAnnualIncome(int annualIncome) {
		this.annualIncome = annualIncome;
	}
	public int getCreditScore() {
		return creditScore;
	}
	public void setCreditScore(int creditScore) {
		this.creditScore = creditScore;
	}
	public int getDisbursedAmount() {
		return disbursedAmount;
	}
	public void setDisbursedAmount(int disbursedAmount) {
		this.disbursedAmount = disbursedAmount;
	}
	public int getVehicleAssessmentValue() {
		return vehicleAssessmentValue;
	}
	public void setVehicleAssessmentValue(int vehicleAssessmentValue) {
		this.vehicleAssessmentValue = vehicleAssessmentValue;
	}
	public int getPaymentAmount() {
		return paymentAmount;
	}
	public void setPaymentAmount(int paymentAmount) {
		this.paymentAmount = paymentAmount;
	}
	public String getVendorName() {
		return vendorName;
	}
	public void setVendorName(String vendorName) {
		this.vendorName = vendorName;
	}
	
	

}