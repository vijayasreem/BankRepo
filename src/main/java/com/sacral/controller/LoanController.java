package com.sacral.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.sacral.model.Loan;
import com.sacral.service.LoanService;

@RestController
public class LoanController {
    
    @Autowired
    private LoanService loanService;

    // Get the approved loan amount for a specific borrower
    @GetMapping("/loans/borrowers/{borrowerId}/approvedAmount")
    public Double getApprovedAmountByBorrowerId(@PathVariable("borrowerId") Long borrowerId){
        return loanService.getApprovedAmountByBorrowerId(borrowerId);
    }

    // Get the approved loan amount for a specific car dealer
    @GetMapping("/loans/carDealers/{carDealerId}/approvedAmount")
    public Double getApprovedAmountByCarDealerId(@PathVariable("carDealerId") Long carDealerId){
        return loanService.getApprovedAmountByCarDealerId(carDealerId);
    }

    // Get the approved loan amount for a specific vehicle
    @GetMapping("/loans/vehicles/{vehicleId}/approvedAmount")
    public Double getApprovedAmountByVehicleId(@PathVariable("vehicleId") Long vehicleId){
        return loanService.getApprovedAmountByVehicleId(vehicleId);
    }

    // Get the pre-qualified loan amount for a specific borrower
    @GetMapping("/loans/borrowers/{borrowerId}/preQualifiedAmount")
    public Double getPreQualifiedAmountByBorrowerId(@PathVariable("borrowerId") Long borrowerId){
        return loanService.getPreQualifiedAmountByBorrowerId(borrowerId);
    }

    // Get the pre-approved loan amount for a specific car dealer
    @GetMapping("/loans/carDealers/{carDealerId}/preApprovedAmount")
    public Double getPreApprovedAmountByCarDealerId(@PathVariable("carDealerId") Long carDealerId){
        return loanService.getPreApprovedAmountByCarDealerId(carDealerId);
    }

    // Get the pre-approved loan amount for a specific vehicle
    @GetMapping("/loans/vehicles/{vehicleId}/preApprovedAmount")
    public Double getPreApprovedAmountByVehicleId(@PathVariable("vehicleId") Long vehicleId){
        return loanService.getPreApprovedAmountByVehicleId(vehicleId);
    }

    // Get the approved loan amount for a specific loan
    @GetMapping("/loans/{loanId}/approvedAmount")
    public Double getApprovedAmountByLoanId(@PathVariable("loanId") Long loanId){
        return loanService.getApprovedAmountByLoanId(loanId);
    }

    // Get the disbursed loan amount to either the car dealer or the borrower
    @GetMapping("/loans/{loanId}/disbursedAmount")
    public Double getDisbursedAmountByLoanId(@PathVariable("loanId") Long loanId){
        return loanService.getDisbursedAmountByLoanId(loanId);
    }

    // Get the title of the vehicle as collateral
    @GetMapping("/loans/vehicles/{vehicleId}/titleCollateral")
    public String getTitleCollateralByVehicleId(@PathVariable("vehicleId") Long vehicleId){
        return loanService.getTitleCollateralByVehicleId(vehicleId);
    }

    // Get the loan accounts for a specific borrower
    @GetMapping("/loans/borrowers/{borrowerId}/accounts")
    public List<Loan> getLoanAccount