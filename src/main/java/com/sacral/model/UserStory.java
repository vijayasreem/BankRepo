package com.sacral.model;

import javax.persistence.*;

@Entity
@Table(name = "user_story")
public class UserStory {
    
    @Id
    @GeneratedValue
    private Long id;
    
    @Column(name = "doc_format")
    private String docFormat;
    
    @Column(name = "salary")
    private int salary;
    
    @Column(name = "employment_status")
    private String employmentStatus;
    
    @Column(name = "age")
    private int age;
    
    @Column(name = "credit_score")
    private int creditScore;
    
    @Column(name = "approved_loan_amount")
    private int approvedLoanAmount;
    
    @Column(name = "user_role")
    private String userRole;
    
    @Column(name = "recipient_name")
    private String recipientName;
    
    @Column(name = "recipient_email")
    private String recipientEmail;
    
    @Column(name = "recipient_bank_account_details")
    private String recipientBankAccountDetails;
    
    public UserStory() {
    }
    
    public Long getId() {
        return id;
    }
    
    public void setId(Long id) {
        this.id = id;
    }
    
    public String getDocFormat() {
        return docFormat;
    }
    
    public void setDocFormat(String docFormat) {
        this.docFormat = docFormat;
    }
    
    public int getSalary() {
        return salary;
    }
    
    public void setSalary(int salary) {
        this.salary = salary;
    }
    
    public String getEmploymentStatus() {
        return employmentStatus;
    }
    
    public void setEmploymentStatus(String employmentStatus) {
        this.employmentStatus = employmentStatus;
    }
    
    public int getAge() {
        return age;
    }
    
    public void setAge(int age) {
        this.age = age;
    }
    
    public int getCreditScore() {
        return creditScore;
    }
    
    public void setCreditScore(int creditScore) {
        this.creditScore = creditScore;
    }
    
    public int getApprovedLoanAmount() {
        return approvedLoanAmount;
    }
    
    public void setApprovedLoanAmount(int approvedLoanAmount) {
        this.approvedLoanAmount = approvedLoanAmount;
    }
    
    public String getUserRole() {
        return userRole;
    }
    
    public void setUserRole(String userRole) {
        this.userRole = userRole;
    }
    
    public String getRecipientName() {
        return recipientName;
    }
    
    public void setRecipientName(String recipientName) {
        this.recipientName = recipientName;
    }
    
    public String getRecipientEmail() {
        return recipientEmail;
    }
    
    public void setRecipientEmail(String recipientEmail) {
        this.recipientEmail = recipientEmail;
    }
    
    public String getRecipientBankAccountDetails() {
        return recipientBankAccountDetails;
    }
    
    public void setRecipientBankAccountDetails(String recipientBankAccountDetails) {
        this.recipientBankAccountDetails = recipientBankAccountDetails;
    }
}