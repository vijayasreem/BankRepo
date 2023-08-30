package com.sacral.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sacral.entity.ProcessLoanDisbursement;
import com.sacral.repository.ProcessLoanDisbursementRepository;

@Service
public class ProcessLoanDisbursementService {

	@Autowired
	private ProcessLoanDisbursementRepository processLoanDisbursementRepository;
	
	public Optional<ProcessLoanDisbursement> reviewApplicantDocumentsAndCreditworthiness(String applicantDocuments, String creditworthiness) {
		return processLoanDisbursementRepository.findByApplicantDocumentsAndCreditworthiness(applicantDocuments, creditworthiness);
	}
	
	public Optional<ProcessLoanDisbursement> preQualifyApplicantForLoanAmountAndInterestRateRange(int loanAmount, int interestRateRange) {
		return processLoanDisbursementRepository.findByLoanAmountAndInterestRateRange(loanAmount, interestRateRange);
	}
	
	public Optional<ProcessLoanDisbursement> approveLoanWithSpecificTermsAndConditions(String termsAndConditions) {
		return processLoanDisbursementRepository.findByTermsAndConditions(termsAndConditions);
	}
	
	public Optional<ProcessLoanDisbursement> assessVehicleValueToMatchLoanAmountRequested(int vehicleValue, int loanAmount) {
		return processLoanDisbursementRepository.findByVehicleValueAndLoanAmount(vehicleValue, loanAmount);
	}
	
	public Optional<ProcessLoanDisbursement> disburseApprovedLoanAmountToEitherCarDealerOrBorrower(String disbursementTo) {
		return processLoanDisbursementRepository.findByDisbursementTo(disbursementTo);
	}
	
	public Optional<ProcessLoanDisbursement> retainTitleOfVehicleAsCollateralUntilLoanIsRepaid(String titleRetaining) {
		return processLoanDisbursementRepository.findByTitleRetaining(titleRetaining);
	}
	
	public Optional<ProcessLoanDisbursement> provideOnlineAccountPortalOrMobileAppForBorrowersToManageLoanAccount(String accountPortal) {
		return processLoanDisbursementRepository.findByAccountPortal(accountPortal);
	}
	
	public Optional<ProcessLoanDisbursement> manageLatePaymentsAndDefaults(String latePaymentsAndDefaults) {
		return processLoanDisbursementRepository.findByLatePaymentsAndDefaults(latePaymentsAndDefaults);
	}
	
	public Optional<ProcessLoanDisbursement> provideCustomerSupportToAssistBorrowersWithInquiriesOrIssuesRelatedToCarMortgageLoans(String customerSupport) {
		return processLoanDisbursementRepository.findByCustomerSupport(customerSupport);
	}
	
	public Optional<ProcessLoanDisbursement> releaseTitleToBorrowerTransferringOwnershipOnceLoanIsFullyRepaid(String titleRelease) {
		return processLoanDisbursementRepository.findByTitleRelease(titleRelease);
	}
}