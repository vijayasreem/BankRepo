package com.sacral.repository;

import java.util.Scanner;

public class UserStoryRepository {

    public void greetUser() {
        System.out.println("Welcome to the application!");
    }

    public boolean verifyIdentity(String input) {
        // query to verify user identity
        return true;
    }

    public boolean verifyAddress(String input) {
        // query to verify user address
        return true;
    }

    public String verifyIdentityAndAddress(String identity, String address) {
        if (verifyIdentity(identity) && verifyAddress(address)) {
            return "Identity and address verification successful. You are eligible for banking services.";
        } else if (verifyIdentity(identity) && !verifyAddress(address)) {
            return "Identity verified, address verification pending. Please complete address verification for full access.";
        } else if (!verifyIdentity(identity) && verifyAddress(address)) {
            return "Address verified, identity verification pending. Please complete identity verification for full access.";
        } else {
            return "Document verification incomplete. You are not eligible for banking services.";
        }
    }

    public String verifyCreditEligibility(double income, int creditScore) {
        // query to verify credit eligibility
        if (income > 50000 && creditScore > 750) {
            return "Congratulations! You are eligible for a credit card with a high limit.";
        } else if (income > 30000 && creditScore > 550) {
            return "You are eligible for a credit card with a moderate limit.";
        } else {
            return "You are not currently eligible for a credit card.";
        }
    }

    public void closeScanner(Scanner sc) {
        sc.close();
    }

    public boolean verifyVehicleAssessment(double disbursedAmount, double vehicleAssessmentValue) {
        if (disbursedAmount <= vehicleAssessmentValue) {
            return true;
        } else {
            return false;
        }
    }

    public void disburseAmount(double disbursedAmount, String recipient) {
        // query to simulate disbursement logic to appropriate recipient
    }

    public boolean verifyVendorInfo(String vendorName) {
        // query to verify vendor information
        return true;
    }

    public boolean verifyFundsAvailability(double paymentAmount) {
        // query to verify funds availability
        return true;
    }

    public void approvePayment(double paymentAmount) {
        // query to approve payment
    }

}