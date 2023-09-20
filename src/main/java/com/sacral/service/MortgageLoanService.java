package com.sacral.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sacral.repository.MortgageLoanRepository;

@Service
public class MortgageLoanService {

    @Autowired
    private MortgageLoanRepository mortgageLoanRepository;

    public MortgageLoan findByCustomerId(long customerId) {
        return mortgageLoanRepository.findByCustomerId(customerId);
    }

    public List<MortgageLoan> findByPreQualified() {
        return mortgageLoanRepository.findByPreQualified();
    }

    public List<MortgageLoan> findByApproved() {
        return mortgageLoanRepository.findByApproved();
    }

    public List<MortgageLoan> findByLoanOfferAccepted() {
        return mortgageLoanRepository.findByLoanOfferAccepted();
    }

    public void disburseLoanAmount(long customerId, double loanAmount) {
        mortgageLoanRepository.disburseLoanAmount(customerId, loanAmount);
    }
    
    public void collectCustomerInformation(long customerId) {
        // logic to collect customer information and verify documents
    }
    
    public void performCreditCheck(long customerId) {
        // logic to perform a credit check and pre-qualify applicants
    }
    
    public void assessVehicles(long customerId) {
        // logic to approve loans and assess vehicles
    }
    
    public void acceptLoanOffers(long customerId) {
        // logic to accept loan offers
    }
    
    public void provideAccurateResults(long customerId) {
        // logic to provide accurate and efficient results
    }

}