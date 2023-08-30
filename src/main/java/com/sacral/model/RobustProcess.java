package com.sacral.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "robust_process")
public class RobustProcess {
 
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private Integer id;
 
    @Column(name = "document_verification")
    private String documentVerification;
 
    @Column(name = "credit_evaluation")
    private String creditEvaluation;
 
    @Column(name = "pre_qualification")
    private String preQualification;
 
    @Column(name = "transparent_approval_process")
    private String transparentApprovalProcess;
 
    @Column(name = "disbursement_flexibility")
    private String disbursementFlexibility;
 
    // getters and setters
}