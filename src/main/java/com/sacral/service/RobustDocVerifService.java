package com.sacral.service;

import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class RobustDocVerifService {

  private RobustDocVerifRepository robustDocVerifRepository;

  public RobustDocVerifService(RobustDocVerifRepository robustDocVerifRepository) {
    this.robustDocVerifRepository = robustDocVerifRepository;
  }

  // Method to validate file formats
  public Boolean validateFileFormat(String fileFormat) {
    return robustDocVerifRepository.validateFileFormat(fileFormat);
  }

  // Method to check customer's age and credit score
  public Boolean checkAgeAndCreditScore(int age, int creditScore) {
    if (age < 18 || age > 65 || creditScore < 600) {
      return false;
    }
    return robustDocVerifRepository.checkAgeAndCreditScore(age, creditScore);
  }

  // Method to pre-qualify applicant for loan amount and interest rate range
  public Boolean preQualifyApplicant(int loanAmount, double interestRate) {
    return robustDocVerifRepository.preQualifyApplicant(loanAmount, interestRate);
  }

  // Method to approve loan with specific terms and conditions
  public Boolean approveLoan(int loanAmount, double interestRate, int repaymentPeriod) {
    return robustDocVerifRepository.approveLoan(loanAmount, interestRate, repaymentPeriod);
  }

  // Method to disburse approved loan amount
  public Boolean disburseLoan(String disburseType) {
    return robustDocVerifRepository.disburseLoan(disburseType);
  }

  // Method to authenticate user
  public Boolean authenticateUser(String userName, String password) {
    return robustDocVerifRepository.authenticateUser(userName, password);
  }

  // Method to define user roles and permissions for different actions
  public Boolean defineUserRolesAndPermissions(String roleName, List<String> permissions) {
    return robustDocVerifRepository.defineUserRolesAndPermissions(roleName, permissions);
  }

}