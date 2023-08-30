package com.sacral.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sacral.entity.ProcessLoanDisbursement;

@Repository
public interface ProcessLoanDisbursementRepository extends JpaRepository<ProcessLoanDisbursement, Long> {
	
	public ProcessLoanDisbursement findByApplicantDocumentsAndCreditworthiness(String applicantDocuments, String creditworthiness);
	
	public ProcessLoanDisbursement findByLoanAmountAndInterestRateRange(int loanAmount, int interestRateRange);
	
	public ProcessLoanDisbursement findByTermsAndConditions(String termsAndConditions);
	
	public ProcessLoanDisbursement findByVehicleValueAndLoanAmount(int vehicleValue, int loanAmount);
	
	public ProcessLoanDisbursement findByDisbursementTo(String disbursementTo);
	
	public ProcessLoanDisbursement findByTitleRetaining(String titleRetaining);
	
	public ProcessLoanDisbursement findByAccountPortal(String accountPortal);
	
	public ProcessLoanDisbursement findByLatePaymentsAndDefaults(String latePaymentsAndDefaults);
	
	public ProcessLoanDisbursement findByCustomerSupport(String customerSupport);
	
	public ProcessLoanDisbursement findByTitleRelease(String titleRelease);
	
}