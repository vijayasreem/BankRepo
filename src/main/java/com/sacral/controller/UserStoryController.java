package com.sacral.controller;

import com.sacral.repository.UserStoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/userstory")
public class UserStoryController {

    @Autowired
    private UserStoryRepository userStoryRepository;

    @RequestMapping(value = "/verifyDocumentFormat", method = RequestMethod.GET)
    public boolean verifyDocumentFormat(String doc) {
        return userStoryRepository.verifyDocumentFormat(doc);
    }

    @RequestMapping(value = "/evaluateCreditworthiness", method = RequestMethod.GET)
    public boolean evaluateCreditworthiness(int salary, String employmentStatus) {
        return userStoryRepository.evaluateCreditworthiness(salary, employmentStatus);
    }

    @RequestMapping(value = "/checkCustomerAge", method = RequestMethod.GET)
    public boolean checkCustomerAge(int age) {
        return userStoryRepository.checkCustomerAge(age);
    }

    @RequestMapping(value = "/checkCreditScore", method = RequestMethod.GET)
    public boolean checkCreditScore(int creditScore) {
        return userStoryRepository.checkCreditScore(creditScore);
    }

    @RequestMapping(value = "/disbursementLogic", method = RequestMethod.GET)
    public void disbursementLogic(int approvedLoanAmount) {
        userStoryRepository.disbursementLogic(approvedLoanAmount);
    }

    @RequestMapping(value = "/defineUserRoles", method = RequestMethod.GET)
    public void defineUserRoles(String userRole) {
        userStoryRepository.defineUserRoles(userRole);
    }

    @RequestMapping(value = "/addRecipientProfile", method = RequestMethod.GET)
    public void addRecipientProfile(String name, String email, String bankAccountDetails) {
        userStoryRepository.addRecipientProfile(name, email, bankAccountDetails);
    }

    @RequestMapping(value = "/editRecipientProfile", method = RequestMethod.GET)
    public void editRecipientProfile(String name, String email, String bankAccountDetails) {
        userStoryRepository.editRecipientProfile(name, email, bankAccountDetails);
    }

    @RequestMapping(value = "/deleteRecipientProfile", method = RequestMethod.GET)
    public void deleteRecipientProfile(String name) {
        userStoryRepository.deleteRecipientProfile(name);
    }

}