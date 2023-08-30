package com.sacral.service;

import java.io.IOException;

import com.sacral.repository.UserStoryRepository;

public class UserStoryService {

	private UserStoryRepository userStoryRepository;

	public UserStoryService(UserStoryRepository userStoryRepository) {
		this.userStoryRepository = userStoryRepository;
	}

	public void acceptDocuments(String fileFormat) throws IOException {
		userStoryRepository.acceptDocuments(fileFormat);
	}

	public boolean evaluateCreditScore(int creditScore) throws Exception {
		if (creditScore < 600) {
			return false;
		} else if (creditScore >= 700) {
			return true;
		} else {
			return userStoryRepository.evaluateCreditScore(creditScore);
		}
	}

	public boolean checkAge(int age) throws Exception {
		if (age < 18 || age > 65) {
			return false;
		} else {
			return userStoryRepository.checkAge(age);
		}
	}

	public void defineUserRoles() throws Exception {
		userStoryRepository.defineUserRoles();
	}

	public void addEditDeleteRecipientProfiles(String name, String email, String bankAccount) throws Exception {
		userStoryRepository.addEditDeleteRecipientProfiles(name, email, bankAccount);
	}

	public void disburseApprovedLoanAmount(String recipient) throws Exception {
		userStoryRepository.disburseApprovedLoanAmount(recipient);
	}

}