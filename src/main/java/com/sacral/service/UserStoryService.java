package com.sacral.service;

import java.util.Scanner;

import com.sacral.repository.UserStoryRepository;

public class UserStoryService {

    private UserStoryRepository userStoryRepository;

    public UserStoryService(UserStoryRepository userStoryRepository) {
        this.userStoryRepository = userStoryRepository;
    }

    public void greetUser() {
        userStoryRepository.greetUser();
    }

    public String verifyIdentityAndAddress(String identity, String address) {
        return userStoryRepository.verifyIdentityAndAddress(identity, address);
    }

    public String verifyCreditEligibility(double income, int creditScore) {
        return userStoryRepository.verifyCreditEligibility(income, creditScore);
    }

    public void closeScanner(Scanner sc) {
        userStoryRepository.closeScanner(sc);
    }

    public boolean verifyVehicleAssessment(double disbursedAmount, double vehicleAssessmentValue) {
        return userStoryRepository.verifyVehicleAssessment(disbursedAmount, vehicleAssessmentValue);
    }

    public void disburseAmount(double disbursedAmount, String recipient) {
        userStoryRepository.disburseAmount(disbursedAmount, recipient);
    }

    public boolean verifyVendorInfo(String vendorName) {
        return userStoryRepository.verifyVendorInfo(vendorName);
    }

    public boolean verifyFundsAvailability(double paymentAmount) {
        return userStoryRepository.verifyFundsAvailability(paymentAmount);
    }

    public void approvePayment(double paymentAmount) {
        userStoryRepository.approvePayment(paymentAmount);
    }

}