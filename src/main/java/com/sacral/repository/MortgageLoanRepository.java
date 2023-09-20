package com.sacral.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface MortgageLoanRepository extends JpaRepository<MortgageLoan, Long> {

    @Query("SELECT * FROM MortgageLoan WHERE customerId = :customerId")
    MortgageLoan findByCustomerId(long customerId);
    
    @Query("SELECT * FROM MortgageLoan WHERE preQualified = 0")
    List<MortgageLoan> findByPreQualified();
    
    @Query("SELECT * FROM MortgageLoan WHERE approved = 1")
    List<MortgageLoan> findByApproved();
    
    @Query("SELECT * FROM MortgageLoan WHERE loanOfferAccepted = 1")
    List<MortgageLoan> findByLoanOfferAccepted();
    
    @Query("UPDATE MortgageLoan SET loanAmount = :loanAmount WHERE customerId = :customerId")
    void disburseLoanAmount(long customerId, double loanAmount);
    
}