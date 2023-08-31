package com.sacral.controller;

import java.util.Scanner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.sacral.model.UserStoryInput;
import com.sacral.repository.UserStoryRepository;
import com.sacral.service.UserStoryService;

@RestController
public class UserStoryController {

    @Autowired
    private UserStoryService userStoryService;

    @Autowired
    private UserStoryRepository userStoryRepository;

    @PostMapping("/userStory")
    public String userStory(@RequestBody UserStoryInput userStoryInput) {
        Scanner sc = new Scanner(System.in);
        userStoryService.greetUser();
        String identityVerification = userStoryService.verifyIdentityAndAddress(userStoryInput.getIdentity(), userStoryInput.getAddress());
        System.out.println(identityVerification);
        String creditEligibility = userStoryService.verifyCreditEligibility(userStoryInput.getIncome(), userStoryInput.getCreditScore());
        System.out.println(creditEligibility);
        if (creditEligibility.equals("Congratulations! You are eligible for a high-limit credit card.")) {
            boolean vehicleAssessment = userStoryService.verifyVehicleAssessment(userStoryInput.getDisbursedAmount(), userStoryInput.getVehicleAssessmentValue());
            if (vehicleAssessment) {
                userStoryService.disburseAmount(userStoryInput.getDisbursedAmount(), userStoryInput.getRecipient());
            } else {
                System.out.println("The loan amount cannot exceed the vehicle value.");
            }
        } else if (creditEligibility.equals("Congratulations! You are eligible for a moderate-limit credit card.")) {
            boolean vendorInfo = userStoryService.verifyVendorInfo(userStoryInput.getVendorName());
            if (vendorInfo) {
                boolean fundsAvailability = userStoryService.verifyFundsAvailability(userStoryInput.getPaymentAmount());
                if (fundsAvailability) {
                    userStoryService.approvePayment(userStoryInput.getPaymentAmount());
                    System.out.println("The payment of $" + userStoryInput.getPaymentAmount() + " has been approved to " + userStoryInput.getVendorName() + ".");
                } else {
                    System.out.println("Insufficient funds for disbursement.");
                }
            } else {
                System.out.println("The vendor information is invalid.");
            }
        }
        userStoryService.closeScanner(sc);
        return "Application closed";
    }

}