package com.sacral.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Loan {
 
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private Long borrowerId;
    private Long carDealerId;
    private Long vehicleId;
    private Double preQualifiedAmount;
    private Double preApprovedAmount;
    private Double approvedAmount;
    private Double disbursedAmount;
    private String titleCollateral;
    private Boolean isLatePayment;
    private Boolean isDefault;
    private Boolean isFullyPaid;
 
    public Long getId() {
        return id;
    }
 
    public void setId(Long id) {
        this.id = id;
    }
 
    public Long getBorrowerId() {
        return borrowerId;
    }
 
    public void setBorrowerId(Long borrowerId) {
        this.borrowerId = borrowerId;
    }
 
    public Long getCarDealerId() {
        return carDealerId;
    }
 
    public void setCarDealerId(Long carDealerId) {
        this.carDealerId = carDealerId;
    }
 
    public Long getVehicleId() {
        return vehicleId;
    }
 
    public void setVehicleId(Long vehicleId) {
        this.vehicleId = vehicleId;
    }
 
    public Double getPreQualifiedAmount() {
        return preQualifiedAmount;
    }
 
    public void setPreQualifiedAmount(Double preQualifiedAmount) {
        this.preQualifiedAmount = preQualifiedAmount;
    }
 
    public Double getPreApprovedAmount() {
        return preApprovedAmount;
    }
 
    public void setPreApprovedAmount(Double preApprovedAmount) {
        this.preApprovedAmount = preApprovedAmount;
    }
 
    public Double getApprovedAmount() {
        return approvedAmount;
    }
 
    public void setApprovedAmount(Double approvedAmount) {
        this.approvedAmount = approvedAmount;
    }
 
    public Double getDisbursedAmount() {
        return disbursedAmount;
    }
 
    public void setDisbursedAmount(Double disbursedAmount) {
        this.disbursedAmount = disbursedAmount;
    }
 
    public String getTitleCollateral() {
        return titleCollateral;
    }
 
    public void setTitleCollateral(String titleCollateral) {
        this.titleCollateral = titleCollateral;
    }
 
    public Boolean getIsLatePayment() {
        return isLatePayment;
    }
 
    public void setIsLatePayment(Boolean isLatePayment) {
        this.isLatePayment = isLatePayment;
    }
 
    public Boolean getIsDefault() {
        return isDefault;
    }
 
    public void setIsDefault(Boolean isDefault) {
        this.isDefault = isDefault;
    }
 
    public Boolean getIsFullyPaid() {
        return isFullyPaid;
    }
 
    public void setIsFullyPaid(Boolean isFullyPaid) {
        this.isFullyPaid = isFullyPaid;
    }
 
}