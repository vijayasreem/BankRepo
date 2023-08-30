package com.sacral.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.sacral.entity.ProcessLoanDisbursement;
import com.sacral.service.ProcessLoanDisbursementService;

@RestController
public class ProcessLoanDisbursementController {

	@Autowired
	private ProcessLoanDisbursementService processLoanDisbursementService;
	
	@GetMapping("/reviewApplicantDocumentsAndCreditworthiness")
	public Optional<ProcessLoanDisbursement> reviewApplicantDocumentsAndCreditworthiness(@RequestParam String applicantDocuments, 
																					   @RequestParam String creditworthiness) {
		return processLoanDisbursementService.reviewApplicantDocumentsAndCreditworthiness(applicantDocuments, creditworthiness);
	}
	
	@GetMapping("/preQualifyApplicantForLoanAmountAndInterestRateRange")
	public Optional<ProcessLoanDisbursement> preQualifyApplicantForLoanAmountAndInterestRateRange(@RequestParam int loanAmount, 
																								  @RequestParam int interestRateRange) {
		return processLoanDisbursementService.preQualifyApplicantForLoanAmountAndInterestRateRange(loanAmount, interestRateRange);
	}
	
	@GetMapping("/approveLoanWithSpecificTermsAndConditions")
	public Optional<ProcessLoanDisbursement> approveLoanWithSpecificTermsAndConditions(@RequestParam String termsAndConditions) {
		return processLoanDisbursementService.approveLoanWithSpecificTermsAndConditions(termsAndConditions);
	}
	
	@GetMapping("/assessVehicleValueToMatchLoanAmountRequested")
	public Optional<ProcessLoanDisbursement> assessVehicleValueToMatchLoanAmountRequested(@RequestParam int vehicleValue, 
																						 @RequestParam int loanAmount) {
		return processLoanDisbursementService.assessVehicleValueToMatchLoanAmountRequested(vehicleValue, loanAmount);
	}
	
	@GetMapping("/disburseApprovedLoanAmountToEitherCarDealerOrBorrower")
	public Optional<ProcessLoanDisbursement> disburseApprovedLoanAmountToEitherCarDealerOrBorrower(@RequestParam String disbursementTo) {
		return processLoanDisbursementService.disburseApprovedLoanAmountToEitherCarDealerOrBorrower(disbursementTo);
	}
	
	@GetMapping("/retainTitleOfVehicleAsCollateralUntilLoanIsRepaid")
	public Optional<ProcessLoanDisbursement> retainTitleOfVehicleAsCollateralUntilLoanIsRepaid(@RequestParam String titleRetaining) {
		return processLoanDisbursementService.retainTitleOfVehicleAsCollateralUntilLoanIsRepaid(titleRetaining);
	}
	
	@GetMapping("/provideOnlineAccountPortalOrMobileAppForBorrowersToManageLoanAccount")
	public Optional<ProcessLoanDisbursement> provideOnlineAccountPortalOrMobileAppForBorrowersToManageLoanAccount(@RequestParam String accountPortal) {
		return processLoanDisbursementService.provideOnlineAccountPortalOrMobileAppForBorrowersToManageLoanAccount(accountPortal);
	}
	
	@GetMapping("/manageLatePaymentsAndDefaults")
	public Optional<ProcessLoanDisbursement> manageLatePaymentsAndDefaults(@RequestParam String latePaymentsAndDefaults) {
		return processLoanDisbursementService.manageLatePaymentsAndDefaults(latePaymentsAndDefaults);
	}
	
	@GetMapping("/provideCustomerSupportToAssistBorrow