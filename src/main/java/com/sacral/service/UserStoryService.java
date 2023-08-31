package com.sacral.service;

import com.sacral.repository.UserStoryRepository;
import java.util.Scanner;

@Repository
public class UserStoryService {

    private UserStoryRepository repository;

    public UserStoryService(UserStoryRepository repository){
        this.repository = repository;
    }

    public void runUserStory(){
        repository.greetUser();

        Scanner scanner = repository.importScanner();
        System.out.println("Please enter your name:");
        String name = scanner.nextLine();

        System.out.println("Please enter your address:");
        String address = scanner.nextLine();

        boolean identityVerified = repository.verifyIdentity(name);
        boolean addressVerified = repository.verifyAddress(address);

        if(identityVerified && addressVerified){
            repository.successMessage();
        } else if(identityVerified && !addressVerified){
            repository.addressVerificationPendingMessage();
        } else if(!identityVerified && addressVerified){
            repository.identityVerificationPendingMessage();
        } else {
            repository.documentVerificationIncompleteMessage();
        }

        System.out.println("Please enter your annual income:");
        int annualIncome = scanner.nextInt();

        System.out.println("Please enter your credit score:");
        int creditScore = scanner.nextInt();

        boolean creditScoreVerified = repository.verifyCreditScore(annualIncome, creditScore);

        if(creditScoreVerified){
            repository.congratsMessageHighLimit();
        } else {
            repository.congratsMessageModerateLimit();
        }

        repository.closeScanner(scanner);
        repository.closeApplication();
    }

    public void runPaymentVerification(){
        Scanner scanner = repository.importScanner();
        System.out.println("Please enter the payment amount:");
        int paymentAmount = scanner.nextInt();

        boolean paymentApproved = repository.verifyPaymentApproval(paymentAmount);
        if(paymentApproved){
            repository.approvePaymentMessage();
            repository.verifyVendorMessage();
            repository.confirmFundsMessage();
            System.out.println("Please enter the vendor's name:");
            String vendorName = scanner.nextLine();
            repository.disbursementMessage(vendorName, paymentAmount);
        } else {
            repository.invalidVendorMessage();
        }

        repository.closeScanner(scanner);
    }

    public void runAssessmentVerification(){
        Scanner scanner = repository.importScanner();
        System.out.println("Please enter the disbursed amount:");
        int disbursedAmount = scanner.nextInt();

        System.out.println("Please enter the vehicle assessment value:");
        int vehicleAssessmentValue = scanner.nextInt();

        boolean assessmentVerified = repository.verifyAssessmentValue(disbursedAmount, vehicleAssessmentValue);

        if(assessmentVerified){
            repository.assessmentPassedMessage(disbursedAmount);
        } else {
            repository.assessmentFailedMessage(disbursedAmount);
        }

        repository.closeScanner(scanner);
    }

}