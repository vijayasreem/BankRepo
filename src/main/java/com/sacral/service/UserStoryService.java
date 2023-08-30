package com.sacral.service;

import org.springframework.stereotype.Service;
import com.sacral.repository.UserStoryRepository;
import org.springframework.beans.factory.annotation.Autowired;

@Service
public class UserStoryService {

    @Autowired
    private UserStoryRepository userStoryRepository;

    public void verifyDocumentFormat(String format) throws Exception {
        userStoryRepository.verifyDocumentFormat(format);
    }

    public void evaluateCreditWorthiness(String income, String employmentStatus) {
        userStoryRepository.evaluateCreditWorthiness(income, employmentStatus);
    }

    public void checkCustomerAge(int age) {
        if (age < 18 || age > 65) {
            throw new IllegalArgumentException("Age must be between 18 and 65");
        }
        userStoryRepository.checkCustomerAge(age);
    }

    public void checkCreditScore(int score) {
        if (score < 600) {
            throw new IllegalArgumentException("Credit score must be greater than 600");
        }
        userStoryRepository.checkCreditScore(score);
    }

    public void defineDisbursementLogic(int amount) {
        userStoryRepository.defineDisbursementLogic(amount);
    }

    public void defineUserRolesAndPermissions() {
        userStoryRepository.defineUserRolesAndPermissions();
    }

    public void addRecipientProfile(String name, String email, String bankAccountDetails) {
        userStoryRepository.addRecipientProfile(name, email, bankAccountDetails);
    }

    public void editRecipientProfile(String name, String email, String bankAccountDetails) {
        userStoryRepository.editRecipientProfile(name, email, bankAccountDetails);
    }

    public void deleteRecipientProfile(String name, String email, String bankAccountDetails) {
        userStoryRepository.deleteRecipientProfile(name, email, bankAccountDetails);
    }

}