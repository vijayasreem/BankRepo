package com.sacral.model;

import java.util.List;

public class RobustDocVerif {

    private Boolean validateFileFormat;
    private Boolean checkAgeAndCreditScore;
    private Boolean preQualifyApplicant;
    private Boolean approveLoan;
    private Boolean disburseLoan;
    private Boolean authenticateUser;
    private Boolean defineUserRolesAndPermissions;
    private String fileFormat;
    private int age;
    private int creditScore;
    private int loanAmount;
    private double interestRate;
    private int repaymentPeriod;
    private String disburseType;
    private String userName;
    private String password;
    private String roleName;
    private List<String> permissions;

    public RobustDocVerif() {
    }

    public RobustDocVerif(Boolean validateFileFormat, Boolean checkAgeAndCreditScore, Boolean preQualifyApplicant, Boolean approveLoan, Boolean disburseLoan, Boolean authenticateUser, Boolean defineUserRolesAndPermissions, String fileFormat, int age, int creditScore, int loanAmount, double interestRate, int repaymentPeriod, String disburseType, String userName, String password, String roleName, List<String> permissions) {
        this.validateFileFormat = validateFileFormat;
        this.checkAgeAndCreditScore = checkAgeAndCreditScore;
        this.preQualifyApplicant = preQualifyApplicant;
        this.approveLoan = approveLoan;
        this.disburseLoan = disburseLoan;
        this.authenticateUser = authenticateUser;
        this.defineUserRolesAndPermissions = defineUserRolesAndPermissions;
        this.fileFormat = fileFormat;
        this.age = age;
        this.creditScore = creditScore;
        this.loanAmount = loanAmount;
        this.interestRate = interestRate;
        this.repaymentPeriod = repaymentPeriod;
        this.disburseType = disburseType;
        this.userName = userName;
        this.password = password;
        this.roleName = roleName;
        this.permissions = permissions;
    }

    public Boolean getValidateFileFormat() {
        return validateFileFormat;
    }

    public void setValidateFileFormat(Boolean validateFileFormat) {
        this.validateFileFormat = validateFileFormat;
    }

    public Boolean getCheckAgeAndCreditScore() {
        return checkAgeAndCreditScore;
    }

    public void setCheckAgeAndCreditScore(Boolean checkAgeAndCreditScore) {
        this.checkAgeAndCreditScore = checkAgeAndCreditScore;
    }

    public Boolean getPreQualifyApplicant() {
        return preQualifyApplicant;
    }

    public void setPreQualifyApplicant(Boolean preQualifyApplicant) {
        this.preQualifyApplicant = preQualifyApplicant;
    }

    public Boolean getApproveLoan() {
        return approveLoan;
    }

    public void setApproveLoan(Boolean approveLoan) {
        this.approveLoan = approveLoan;
    }

    public Boolean getDisburseLoan() {
        return disburseLoan;
    }

    public void setDisburseLoan(Boolean disburseLoan) {
        this.disburseLoan = disburseLoan;
    }

    public Boolean getAuthenticateUser() {
        return authenticateUser;
    }

    public void setAuthenticateUser(Boolean authenticateUser) {
        this.authenticateUser = authenticateUser;
    }

    public Boolean getDefineUserRolesAndPermissions() {
        return defineUserRolesAndPermissions;
    }

    public void setDefineUserRolesAndPermissions(Boolean defineUserRolesAndPermissions) {
        this.defineUserRolesAndPermissions = defineUserRolesAndPermissions;
    }

    public String getFileFormat() {
        return fileFormat;
    }

    public void setFileFormat(String fileFormat) {
        this.fileFormat = fileFormat;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getCreditScore() {
        return creditScore;