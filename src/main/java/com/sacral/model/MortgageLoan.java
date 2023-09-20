package com.sacral.model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class MortgageLoan {
 
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
 
    private long customerId;
    private double loanAmount;
    private boolean preQualified;
    private boolean approved;
    private boolean loanOfferAccepted;
 
    public Long getId() {
        return id;
    }
 
    public void setId(Long id) {
        this.id = id;
    }
 
    public long getCustomerId() {
        return customerId;
    }
 
    public void setCustomerId(long customerId) {
        this.customerId = customerId;
    }
 
    public double getLoanAmount() {
        return loanAmount;
    }
 
    public void setLoanAmount(double loanAmount) {
        this.loanAmount = loanAmount;
    }
 
    public boolean isPreQualified() {
        return preQualified;
    }
 
    public void setPreQualified(boolean preQualified) {
        this.preQualified = preQualified;
    }
 
    public boolean isApproved() {
        return approved;
    }
 
    public void setApproved(boolean approved) {
        this.approved = approved;
    }
 
    public boolean isLoanOfferAccepted() {
        return loanOfferAccepted;
    }
 
    public void setLoanOfferAccepted(boolean loanOfferAccepted) {
        this.loanOfferAccepted = loanOfferAccepted;
    }
 
}