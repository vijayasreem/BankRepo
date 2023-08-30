package com.sacral.service;

import com.sacral.model.Document;
import com.sacral.repository.DocumentUploadRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class DocumentUploadService {

    @Autowired
    DocumentUploadRepository documentUploadRepository;

    public Optional<Document> findByIdentification(String identification) {
        return documentUploadRepository.findByIdentification(identification);
    }

    public Optional<Document> findByProofOfIncome(String proofOfIncome) {
        return documentUploadRepository.findByProofOfIncome(proofOfIncome);
    }

    public Optional<Document> findByCreditHistory(String creditHistory) {
        return documentUploadRepository.findByCreditHistory(creditHistory);
    }

    public Optional<Document> findByEmploymentDetails(String employmentDetails) {
        return documentUploadRepository.findByEmploymentDetails(employmentDetails);
    }

    public void validateDocuments(Document document) {
        // validate the documents for accuracy and completeness
    }

    public void storeDocumentsSecurely(Document document) {
        // store the documents securely
    }

    public void provideFeedback(Document document) {
        // provide feedback to the customer regarding the status of the document upload
    }
}