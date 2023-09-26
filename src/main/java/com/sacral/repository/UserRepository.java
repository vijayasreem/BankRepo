
package com.sacral.repository;

import com.sacral.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

    // Query to get all functionalities related to user profile
    @Query("SELECT u FROM User u")
    List<User> getAllFunctionalities();

    // Query to update Login ID
    @Query("UPDATE User SET loginId = ?2 WHERE id = ?1")
    void updateLoginId(Long userId, String loginId);

    // Query to update Title
    @Query("UPDATE User SET title = ?2 WHERE id = ?1")
    void updateTitle(Long userId, String title);

    // Query to update First Name
    @Query("UPDATE User SET firstName = ?2 WHERE id = ?1")
    void updateFirstName(Long userId, String firstName);

    // Query to update Last Name
    @Query("UPDATE User SET lastName = ?2 WHERE id = ?1")
    void updateLastName(Long userId, String lastName);

    // Query to update Email
    @Query("UPDATE User SET email = ?2 WHERE id = ?1")
    void updateEmail(Long userId, String email);

    // Query to update Phone Number
    @Query("UPDATE User SET phoneNumber = ?2 WHERE id = ?1")
    void updatePhoneNumber(Long userId, String phoneNumber);

    // Query to update Mobile Number
    @Query("UPDATE User SET mobileNumber = ?2 WHERE id = ?1")
    void updateMobileNumber(Long userId, String mobileNumber);

    // Query to save user details
    User save(User user);

    // Query to delete user details
    void delete(User user);

    // Query to change password
    @Query("UPDATE User SET password = ?2 WHERE id = ?1")
    void changePassword(Long userId, String newPassword);
}
