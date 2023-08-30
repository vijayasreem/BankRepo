@Repository
package com.sacral.repository;
import java.io.IOException;

public interface UserStoryRepository {
    void acceptDocuments(String fileFormat) throws IOException;
    boolean evaluateCreditScore(int creditScore) throws Exception;
    boolean checkAge(int age) throws Exception;
    void defineUserRoles() throws Exception;
    void addEditDeleteRecipientProfiles(String name, String email, String bankAccount) throws Exception;
    void disburseApprovedLoanAmount(String recipient) throws Exception;
}