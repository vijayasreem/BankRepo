package com.sacral.model;

public class UserStory {
    
    private String identity;
    private String address;
    private double income;
    private int creditScore;
    private double disbursedAmount;
    private double vehicleAssessmentValue;
    private String vendorName;
    private double paymentAmount;
    
    // Getters and Setters
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

    public double getIncome() {
        return income;
    }

    public void setIncome(double income) {
        this.income = income;
    }

    public int getCreditScore() {
        return creditScore;
    }

    public void setCreditScore(int creditScore) {
        this.creditScore = creditScore;
    }

    public double getDisbursedAmount() {
        return disbursedAmount;
    }

    public void setDisbursedAmount(double disbursedAmount) {
        this.disbursedAmount = disbursedAmount;
    }

    public double getVehicleAssessmentValue() {
        return vehicleAssessmentValue;
    }

    public void setVehicleAssessmentValue(double vehicleAssessmentValue) {
        this.vehicleAssessmentValue = vehicleAssessmentValue;
    }

    public String getVendorName() {
        return vendorName;
    }

    public void setVendorName(String vendorName) {
        this.vendorName = vendorName;
    }

    public double getPaymentAmount() {
        return paymentAmount;
    }

    public void setPaymentAmount(double paymentAmount) {
        this.paymentAmount = paymentAmount;
    }
}