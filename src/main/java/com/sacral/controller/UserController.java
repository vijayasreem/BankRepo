package com.sacral.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.sacral.service.UserService;

@RestController
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("/greetUser")
    public void greetUser() {
        userService.greetUser();
    }

    @GetMapping("/verifyIdentityAndAddress")
    public boolean verifyIdentityAndAddress(@RequestParam String identity, @RequestParam String address) {
        return userService.verifyIdentityAndAddress(identity, address);
    }

    @GetMapping("/evaluateCreditScore")
    public boolean evaluateCreditScore(@RequestParam double annualIncome, @RequestParam int creditScore) {
        return userService.evaluateCreditScore(annualIncome, creditScore);
    }

    @GetMapping("/autoApprovePayment")
    public boolean autoApprovePayment(@RequestParam double paymentAmount) {
        return userService.autoApprovePayment(paymentAmount);
    }

    @GetMapping("/disbursement")
    public void disbursement(@RequestParam String vendorName, @RequestParam boolean fundsAvailable, @RequestParam boolean paymentApproval) {
        userService.disbursement(vendorName, fundsAvailable, paymentApproval);
    }

    @GetMapping("/closeApp")
    public void closeApp() {
        userService.closeApp();
    }
}