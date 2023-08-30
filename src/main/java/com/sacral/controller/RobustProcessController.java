package com.sacral.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sacral.model.RobustProcess;
import com.sacral.service.RobustProcessService;

@RestController
@RequestMapping("/process")
public class RobustProcessController {
    @Autowired
    private RobustProcessService robustProcessService;
 
    @PostMapping("/document-verification")
    public ResponseEntity<RobustProcess> verifyDocument(@RequestBody String documentVerification) {
        RobustProcess process = robustProcessService.verifyDocument(documentVerification);
        return ResponseEntity.ok(process);
    }
 
    @PostMapping("/credit-evaluation")
    public ResponseEntity<RobustProcess> evaluateCredit(@RequestBody String creditEvaluation) {
        RobustProcess process = robustProcessService.evaluateCredit(creditEvaluation);
        return ResponseEntity.ok(process);
    }
 
    @PostMapping("/pre-qualification")
    public ResponseEntity<RobustProcess> preQualify(@RequestBody String preQualification) {
        RobustProcess process = robustProcessService.preQualify(preQualification);
        return ResponseEntity.ok(process);
    }
 
    @PostMapping("/transparent-approval-process")
    public ResponseEntity<RobustProcess> approve(@RequestBody String transparentApprovalProcess) {
        RobustProcess process = robustProcessService.approve(transparentApprovalProcess);
        return ResponseEntity.ok(process);
    }
 
    @PostMapping("/disbursement-flexibility")
    public ResponseEntity<RobustProcess> disburse(@RequestBody String disbursementFlexibility) {
        RobustProcess process = robustProcessService.disburse(disbursementFlexibility);
        return ResponseEntity.ok(process);
    }
 
    @PostMapping("/apply-car-loan")
    public ResponseEntity<String> applyCarLoan(@RequestBody RobustProcess robustProcess){
        robustProcessService.applyCarLoan(robustProcess);
        return ResponseEntity.ok("Car loan application successful!");
    }
}