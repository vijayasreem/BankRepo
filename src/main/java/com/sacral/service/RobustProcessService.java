package com.sacral.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sacral.repository.RobustProcessRepository;

@Service
public class RobustProcessService {
 
    @Autowired
    private RobustProcessRepository robustProcessRepository;
 
    public RobustProcess verifyDocument(String documentVerification) {
        return robustProcessRepository.findByDocumentVerification(documentVerification);
    }
 
    public RobustProcess evaluateCredit(String creditEvaluation) {
        return robustProcessRepository.findByCreditEvaluation(creditEvaluation);
    }
 
    public RobustProcess preQualify(String preQualification) {
        return robustProcessRepository.findByPreQualification(preQualification);
    }
 
    public RobustProcess approve(String transparentApprovalProcess) {
        return robustProcessRepository.findByTransparentApprovalProcess(transparentApprovalProcess);
    }
 
    public RobustProcess disburse(String disbursementFlexibility) {
        return robustProcessRepository.findByDisbursementFlexibility(disbursementFlexibility);
    }
 
    public void applyCarLoan(RobustProcess robustProcess){
        // Implement the logic to apply car loan
        // This could involve calling other services,
        // writing to the database and other activities
    }
}