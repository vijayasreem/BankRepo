/**
 * BankDisbursementController.js
 *
 * This is the controller for the Bank Disbursement component.
 *
 * @author <Your Name Here>
 */
({
    // Initialize the component
    doInit: function(component, event, helper) {
        // Get the applicant's documents and creditworthiness
        helper.getApplicantInfo(component);
        // Pre-qualify the applicant for a loan amount and interest rate range
        helper.preQualifyApplicant(component);
        // Approve the loan with specific terms and conditions
        helper.approveLoan(component);
        // Assess the vehicle's value to ensure it matches the loan amount requested
        helper.assessVehicleValue(component);
        // Disburse the approved loan amount to either the car dealer or the borrower
        helper.disburseLoan(component);
        // Retain the title of the vehicle as collateral until the loan is repaid
        helper.retainTitle(component);
        // Provide an online account portal or mobile app for borrowers to manage their loan account
        helper.providePortal(component);
        // Manage late payments and defaults
        helper.manageDefaults(component);
        // Provide customer support to assist borrowers with any inquiries or issues related to their car mortgage loans
        helper.provideSupport(component);
        // Release the title to the borrower, transferring ownership, once the loan is fully repaid
        helper.releaseTitle(component);
    }
})