package com.sacral.model;

import javax.persistence.*;
import java.util.Optional;

@Entity
@Table(name = "document")
public class Document {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String identification;
    private String proofOfIncome;
    private String creditHistory;
    private String employmentDetails;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getIdentification() {
        return identification;
    }

    public void setIdentification(String identification) {
        this.identification = identification;
    }

    public String getProofOfIncome() {
        return proofOfIncome;
    }

    public void setProofOfIncome(String proofOfIncome) {
        this.proofOfIncome = proofOfIncome;
    }

    public String getCreditHistory() {
        return creditHistory;
    }

    public void setCreditHistory(String creditHistory) {
        this.creditHistory = creditHistory;
    }

    public String getEmploymentDetails() {
        return employmentDetails;
    }

    public void setEmploymentDetails(String employmentDetails) {
        this.employmentDetails = employmentDetails;
    }

    public void validateDocuments() {
        // validation logic
    }

    public void storeDocumentsSecurely() {
        // store document securely logic
    }

    public void provideFeedback() {
        // provide feedback logic
    }
}