package com.sacral.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.sacral.service.UserStoryService;
import org.springframework.beans.factory.annotation.Autowired;

@RestController
public class UserStoryController {

    @Autowired
    private UserStoryService userStoryService;

    @PostMapping("/verifyDocumentFormat")
    public void verifyDocumentFormat(@RequestBody String format) throws Exception {
        userStoryService.verifyDocumentFormat(format);
    }

    @PostMapping("/evaluateCreditWorthiness")
    public void evaluateCreditWorthiness(@RequestBody String income, String employmentStatus) {
        userStoryService.evaluateCreditWorthiness(income, employmentStatus);
    }

    @PostMapping("/checkCustomerAge")
    public void checkCustomerAge(@RequestBody int age) {
        userStoryService.checkCustomerAge(age);
    }

    @PostMapping("/checkCreditScore")
    public void checkCreditScore(@RequestBody int score) {
        userStoryService.checkCreditScore(score);
    }

    @PostMapping("/defineDisbursementLogic")
    public void defineDisbursementLogic(@RequestBody int amount) {
        userStoryService.defineDisbursementLogic(amount);
    }

    @PostMapping("/defineUserRolesAndPermissions")
    public void defineUserRolesAndPermissions() {
        userStoryService.defineUserRolesAndPermissions();
    }

    @PostMapping("/addRecipientProfile")
    public void addRecipientProfile(@RequestBody String name, String email, String bankAccountDetails) {
        userStoryService.addRecipientProfile(name, email, bankAccountDetails);
    }

    @PostMapping("/editRecipientProfile")
    public void editRecipientProfile(@RequestBody String name, String email, String bankAccountDetails) {
        userStoryService.editRecipientProfile(name, email, bankAccountDetails);
    }

    @PostMapping("/deleteRecipientProfile")
    public void deleteRecipientProfile(@RequestBody String name, String email, String bankAccountDetails) {
        userStoryService.deleteRecipientProfile(name, email, bankAccountDetails);
    }

}