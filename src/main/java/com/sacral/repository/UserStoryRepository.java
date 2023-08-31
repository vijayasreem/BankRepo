@Repository
package com.sacral.repository;

import java.util.Scanner;

public class UserStoryRepository {

    public void greetUser(){
        System.out.println("Welcome to the User Story Application!");
    }

    public boolean verifyIdentity(String input){
        //Query to verify the identity of the customer
        return true;
    }

    public boolean verifyAddress(String input){
        //Query to verify the address of the customer
        return true;
    }

    public boolean successMessage(){
        //Query to display a success message if both identity and address are verified
        return true;
    }

    public void identityVerificationPendingMessage(){
        System.out.println("Identity verification is pending and needs to be completed for full access.");
    }

    public void addressVerificationPendingMessage(){
        System.out.println("Address verification is pending and needs to be completed for full access.");
    }

    public void documentVerificationIncompleteMessage(){
        System.out.println("Document verification is incomplete and not eligible for banking services.");
    }

    public boolean verifyCreditScore(int annualIncome, int creditScore){
        //Query to determine eligibility for a credit card based on annual income and credit score
        return true;
    }

    public void congratsMessageHighLimit(){
        System.out.println("Congratulations! You are eligible for a credit card with a high limit.");
    }

    public void congratsMessageModerateLimit(){
        System.out.println("Congratulations! You are eligible for a credit card with a moderate limit.");
    }

    public void notEligibleMessage(){
        System.out.println("You are not currently eligible for a credit card.");
    }

    public void closeApplication(){
        System.out.println("Application closing...");
    }

    public Scanner importScanner(){
        return new Scanner(System.in);
    }

    public boolean verifyAssessmentValue(int disbursedAmount, int vehicleAssessmentValue){
        //Query to determine if the disbursed amount is less than or equal to the vehicle assessment value
        return true;
    }

    public void assessmentPassedMessage(int disbursedAmount){
        System.out.println("Vehicle assessment passed. Disbursed amount: "+disbursedAmount);
    }

    public void assessmentFailedMessage(int loanAmount){
        System.out.println("Vehicle assessment failed. Loan amount cannot exceed vehicle value: "+loanAmount);
    }

    public void closeScanner(Scanner scanner){
        scanner.close();
    }

    public boolean verifyPaymentApproval(int paymentAmount){
        //Query to determine if the payment is approved based on the payment amount
        return true;
    }

    public void approvePaymentMessage(){
        System.out.println("Payment has been approved.");
    }

    public void verifyVendorMessage(){
        System.out.println("Verifying vendor information...");
    }

    public void confirmFundsMessage(){
        System.out.println("Confirming funds availability...");
    }

    public void disbursementMessage(String vendorName, int paymentAmount){
        System.out.println("Successfully disbursed to "+vendorName+" for the payment amount of "+paymentAmount);
    }

    public void invalidVendorMessage(){
        System.out.println("The vendor information is invalid.");
    }

    public void insufficientFundsMessage(){
        System.out.println("Insufficient funds for disbursement.");
    }
}