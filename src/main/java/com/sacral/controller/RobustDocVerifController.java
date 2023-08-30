package com.sacral.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.sacral.service.RobustDocVerifService;

@RestController
@RequestMapping("/robust-doc-verif")
public class RobustDocVerifController {

  @Autowired
  private RobustDocVerifService robustDocVerifService;

  // Method to validate file formats
  @GetMapping("/validate-file-format")
  public Boolean validateFileFormat(@RequestParam String fileFormat) {
    return robustDocVerifService.validateFileFormat(fileFormat);
  }

  // Method to check customer's age and credit score
  @GetMapping("/check-age-and-credit-score")
  public Boolean checkAgeAndCreditScore(@RequestParam int age, @RequestParam int creditScore) {
    return robustDocVerifService.checkAgeAndCreditScore(age, creditScore);
  }

  // Method to pre-qualify applicant for loan amount and interest rate range
  @GetMapping("/pre-qualify-applicant")
  public Boolean preQualifyApplicant(@RequestParam int loanAmount, @RequestParam double interestRate) {
    return robustDocVerifService.preQualifyApplicant(loanAmount, interestRate);
  }

  // Method to approve loan with specific terms and conditions
  @GetMapping("/approve-loan")
  public Boolean approveLoan(@RequestParam int loanAmount, @RequestParam double interestRate,
      @RequestParam int repaymentPeriod) {
    return robustDocVerifService.approveLoan(loanAmount, interestRate, repaymentPeriod);
  }

  // Method to disburse approved loan amount
  @GetMapping("/disburse-loan")
  public Boolean disburseLoan(@RequestParam String disburseType) {
    return robustDocVerifService.disburseLoan(disburseType);
  }

  // Method to authenticate user
  @GetMapping("/authenticate-user")
  public Boolean authenticateUser(@RequestParam String userName, @RequestParam String password) {
    return robustDocVerifService.authenticateUser(userName, password);
  }

  // Method to define user roles and permissions for different actions
  @GetMapping("/define-user-roles-and-permissions")
  public Boolean defineUserRolesAndPermissions(@RequestParam String roleName, @RequestParam List<String> permissions) {
    return robustDocVerifService.defineUserRolesAndPermissions(roleName, permissions);
  }

}