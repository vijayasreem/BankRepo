package com.sacral.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Service;

import com.sacral.model.Loan;
import com.sacral.repository.LoanRepository;

@Service
public class LoanService {

    @Autowired
    private LoanRepository loanRepository;

    // Get the approved loan amount for a specific borrower
    public Double getApprovedAmountByBorrowerId(Long borrowerId){
        return loanRepository.getApprovedAmountByBorrowerId(borrowerId);
    }

    // Get the approved loan amount for a specific car dealer
    public Double getApprovedAmountByCarDealerId(Long carDealerId){
        return loanRepository.getApprovedAmountByCarDealerId(carDealerId);
    }

    // Get the approved loan amount for a specific vehicle
    public Double getApprovedAmountByVehicleId(Long vehicleId){
        return loanRepository.getApprovedAmountByVehicleId(vehicleId);
    }

    // Get the pre-qualified loan amount for a specific borrower
    public Double getPreQualifiedAmountByBorrowerId(Long borrowerId){
        return loanRepository.getPreQualifiedAmountByBorrowerId(borrowerId);
    }

    // Get the pre-approved loan amount for a specific car dealer
    public Double getPreApprovedAmountByCarDealerId(Long carDealerId){
        return loanRepository.getPreApprovedAmountByCarDealerId(carDealerId);
    }

    // Get the pre-approved loan amount for a specific vehicle
    public Double getPreApprovedAmountByVehicleId(Long vehicleId){
        return loanRepository.getPreApprovedAmountByVehicleId(vehicleId);
    }

    // Get the approved loan amount for a specific loan
    public Double getApprovedAmountByLoanId(Long loanId){
        return loanRepository.getApprovedAmountByLoanId(loanId);
    }

    // Get the disbursed loan amount to either the car dealer or the borrower
    public Double getDisbursedAmountByLoanId(Long loanId){
        return loanRepository.getDisbursedAmountByLoanId(loanId);
    }

    // Get the title of the vehicle as collateral
    public String getTitleCollateralByVehicleId(Long vehicleId){
        return loanRepository.getTitleCollateralByVehicleId(vehicleId);
    }

    // Get the loan accounts for a specific borrower
    public List<Loan> getLoanAccountsByBorrowerId(Long borrowerId){
        return loanRepository.getLoanAccountsByBorrowerId(borrowerId);
    }

    // Get the loan accounts for a specific car dealer
    public List<Loan> getLoanAccountsByCarDealerId(Long carDealerId){
        return loanRepository.getLoanAccountsByCarDealerId(carDealerId);
    }

    // Get the loan accounts for a specific vehicle
    public List<Loan> getLoanAccountsByVehicleId(Long vehicleId){
        return loanRepository.getLoanAccountsByVehicleId(vehicleId);
    }

    // Get the loan accounts with late payments or defaults
    public List<Loan> getLoanAccountsWithLatePaymentsOrDefaults(){
        return loanRepository.getLoanAccountsWithLatePaymentsOrDefaults();
    }

    // Get the loan accounts with fully paid
    public List<Loan> getLoanAccountsFullyPaid(){
        return loanRepository.getLoanAccountsFullyPaid();
    }

    // Disburse the approved loan amount to either the car dealer or the borrower
    public void disburseApprovedLoanAmount(Long loanId, Double amount){
        loanRepository.findById(loanId).ifPresent(loan -> {
            loan.setDisbursedAmount(amount);
            loanRepository.save(loan);
        });
    }

}