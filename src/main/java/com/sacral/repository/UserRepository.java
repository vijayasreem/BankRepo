package com.sacral.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.sacral.model.User;

public interface UserRepository extends JpaRepository<User, Long> {

    @Query("SELECT u FROM User u WHERE u.name = :name")
    User findByName(@Param("name") String name);

    @Query("SELECT u FROM User u WHERE u.identity = :identity and u.address = :address")
    User findByIdentityAndAddress(@Param("identity") String identity, @Param("address") String address);

    @Query("SELECT u FROM User u WHERE u.annualIncome >= :annualIncome and u.creditScore >= :creditScore")
    User findByAnnualIncomeAndCreditScore(@Param("annualIncome") double annualIncome, @Param("creditScore") int creditScore);

    @Query("SELECT u FROM User u WHERE u.paymentAmount <= :paymentAmount")
    User findByPaymentAmount(@Param("paymentAmount") double paymentAmount);

    @Query("SELECT u FROM User u WHERE u.vendorName = :vendorName AND u.fundsAvailable = :fundsAvailable AND u.paymentApproval = :paymentApproval")
    User findByVendorNameFundsAvailableAndPaymentApproval(@Param("vendorName") String vendorName, @Param("fundsAvailable") boolean fundsAvailable, @Param("paymentApproval") boolean paymentApproval);
}