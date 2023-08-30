package com.sacral.controller;

import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.sacral.service.UserStoryService;

@RestController
@RequestMapping("/userStory")
public class UserStoryController {
	
	@Autowired
	private UserStoryService userStoryService;
	
	@PostMapping("/acceptDocuments")
	public void acceptDocuments(@RequestParam("fileFormat") String fileFormat) throws IOException {
		userStoryService.acceptDocuments(fileFormat);
	}
	
	@PostMapping("/evaluateCreditScore")
	public boolean evaluateCreditScore(@RequestParam("creditScore") int creditScore) throws Exception {
		return userStoryService.evaluateCreditScore(creditScore);
	}
	
	@PostMapping("/checkAge")
	public boolean checkAge(@RequestParam("age") int age) throws Exception {
		return userStoryService.checkAge(age);
	}
	
	@PostMapping("/defineUserRoles")
	public void defineUserRoles() throws Exception {
		userStoryService.defineUserRoles();
	}
	
	@PostMapping("/addEditDeleteRecipientProfiles")
	public void addEditDeleteRecipientProfiles(@RequestParam("name") String name, 
												@RequestParam("email") String email, 
												@RequestParam("bankAccount") String bankAccount) throws Exception {
		userStoryService.addEditDeleteRecipientProfiles(name, email, bankAccount);
	}
	
	@PostMapping("/disburseApprovedLoanAmount")
	public void disburseApprovedLoanAmount(@RequestParam("recipient") String recipient) throws Exception {
		userStoryService.disburseApprovedLoanAmount(recipient);
	}
	
	

}