package com.sacral.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sacral.model.User;
import com.sacral.repository.UserRepository;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public void greetUser() {
        System.out.println("Welcome to the Document Verification App!");
    }

    public boolean verifyIdentityAndAddress(String identity, String address) {
        User user = userRepository.findByIdentityAndAddress(identity, address);
        if (user != null) {
            System.out.println("Identity and Address verified! You are eligible for banking services.");
            return true;
        } else {
            System.out.println("Document verification incomplete. You are not eligible for banking services.");
            return false;
        }
    }

    public boolean evaluateCreditScore(double annualIncome, int creditScore) {
        User user = userRepository.findByAnnualIncomeAndCreditScore(annualIncome, creditScore);
        if (annualIncome >= 30000 && creditScore >= 700) {
            System.out.println("Congratulations! You are eligible for a high limit credit card!");
            return true;
        } else if (annualIncome >= 20000 && creditScore >= 600) {
            System.out.println("You are eligible for a moderate limit credit card!");
            return true;
        } else {
            System.out.println("Your credit score is not eligible for any credit card.");
            return false;
        }
    }

    public boolean autoApprovePayment(double paymentAmount) {
        User user = userRepository.findByPaymentAmount(paymentAmount);
        if (paymentAmount <= 1000.0) {
            System.out.println("Payment approved!");
            return true;
        } else {
            System.out.println("Payment not approved.");
            return false;
        }
    }

    public void disbursement(String vendorName, boolean fundsAvailable, boolean paymentApproval) {
        User user = userRepository.findByVendorNameFundsAvailableAndPaymentApproval(vendorName, fundsAvailable, paymentApproval);
        if (user != null) {
            System.out.println("Disbursement process successful. Vendor Name: " + vendorName + " Payment Amount: " + user.getPaymentAmount());
        } else {
            System.out.println("Vendor information is invalid.");
        }
    }

    public void closeApp() {
        System.out.println("Closing the application...");
    }
}