package com.sacral.service;

import com.sacral.model.User;
import com.sacral.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class UserService {

    private final UserRepository userRepository;

    @Autowired
    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public List<User> getAllFunctionalities() {
        return userRepository.getAllFunctionalities();
    }

    public void updateLoginId(Long userId, String loginId) {
        userRepository.updateLoginId(userId, loginId);
    }

    public void updateTitle(Long userId, String title) {
        userRepository.updateTitle(userId, title);
    }

    public void updateFirstName(Long userId, String firstName) {
        userRepository.updateFirstName(userId, firstName);
    }

    public void updateLastName(Long userId, String lastName) {
        userRepository.updateLastName(userId, lastName);
    }

    public void updateEmail(Long userId, String email) {
        userRepository.updateEmail(userId, email);
    }

    public void updatePhoneNumber(Long userId, String phoneNumber) {
        userRepository.updatePhoneNumber(userId, phoneNumber);
    }

    public void updateMobileNumber(Long userId, String mobileNumber) {
        userRepository.updateMobileNumber(userId, mobileNumber);
    }

    public User save(User user) {
        return userRepository.save(user);
    }

    public void delete(User user) {
        userRepository.delete(user);
    }

    public void changePassword(Long userId, String newPassword) {
        userRepository.changePassword(userId, newPassword);
    }
}