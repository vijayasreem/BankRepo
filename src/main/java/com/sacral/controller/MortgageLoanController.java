package com.sacral.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.sacral.model.MortgageLoan;
import com.sacral.service.MortgageLoanService;

@RestController
public class MortgageLoanController {

    @Autowired
    private MortgageLoanService mortgageLoanService;

    @GetMapping("/mortgageLoans/customer")
    public MortgageLoan getMortgageLoanByCustomerId(@RequestParam long customerId) {
        return mortgageLoanService.findByCustomerId(customerId);
    }

    @GetMapping("/mortgageLoans/prequalified")
    public List<MortgageLoan> getPreQualifiedMortgageLoans() {
        return mortgageLoanService.findByPreQualified();
    }

    @GetMapping("/mortgageLoans/approved")
    public List<MortgageLoan> getApprovedMortgageLoans() {
        return mortgageLoanService.findByApproved();
    }

    @GetMapping("/mortgageLoans/loanOfferAccepted")
    public List<MortgageLoan> getLoanOfferAcceptedMortgageLoans() {
        return mortgageLoanService.findByLoanOfferAccepted();
    }

    @PostMapping("/mortgageLoans/disburse")
    public void disburseLoanAmount(@RequestParam long customerId, @RequestParam double loanAmount) {
        mortgageLoanService.disburseLoanAmount(customerId, loanAmount);
    }

    @PostMapping("/mortgageLoans/collect")
    public void collectCustomerInformation(@RequestBody long customerId) {
        mortgageLoanService.collectCustomerInformation(customerId);
    }
    
    @PostMapping("/mortgageLoans/creditCheck")
    public void performCreditCheck(@RequestBody long customerId) {
        mortgageLoanService.performCreditCheck(customerId);
    }
    
    @PostMapping("/mortgageLoans/assess")
    public void assessVehicles(@RequestBody long customerId) {
        mortgageLoanService.assessVehicles(customerId);
    }
    
    @PostMapping("/mortgageLoans/accept")
    public void acceptLoanOffers(@RequestBody long customerId) {
        mortgageLoanService.acceptLoanOffers(customerId);
    }
    
    @PostMapping("/mortgageLoans/results")
    public void provideAccurateResults(@RequestBody long customerId) {
        mortgageLoanService.provideAccurateResults(customerId);
    }

}