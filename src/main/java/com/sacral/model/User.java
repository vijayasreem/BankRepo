// Spring Boot Entity/Model Class

package com.sacral.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String identity;
    private String address;
    private double annualIncome;
    private int creditScore;
    private double paymentAmount;
    private String vendorName;
    private boolean fundsAvailable;
    private boolean paymentApproval;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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

    public double getAnnualIncome() {
        return annualIncome;
    }

    public void setAnnualIncome(double annualIncome) {
        this.annualIncome = annualIncome;
    }

    public int getCreditScore() {
        return creditScore;
    }

    public void setCreditScore(int creditScore) {
        this.creditScore = creditScore;
    }

    public double getPaymentAmount() {
        return paymentAmount;
    }

    public void setPaymentAmount(double paymentAmount) {
        this.paymentAmount = paymentAmount;
    }

    public String getVendorName() {
        return vendorName;
    }

    public void setVendorName(String vendorName) {
        this.vendorName = vendorName;
    }

    public boolean isFundsAvailable() {
        return fundsAvailable;
    }

    public void setFundsAvailable(boolean fundsAvailable) {
        this.fundsAvailable = fundsAvailable;
    }

    public boolean isPaymentApproval() {
        return paymentApproval;
    }

    public void setPaymentApproval(boolean paymentApproval) {
        this.paymentApproval = paymentApproval;
    }

}