package com.sacral.controller;

import com.sacral.model.User;
import com.sacral.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/users")
public class UserController {

    private final UserService userService;

    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping
    public List<User> getAllUsers() {
        return userService.getAllFunctionalities();
    }

    @PutMapping("/{userId}/loginId")
    public void updateLoginId(@PathVariable Long userId, @RequestBody String loginId) {
        userService.updateLoginId(userId, loginId);
    }

    @PutMapping("/{userId}/title")
    public void updateTitle(@PathVariable Long userId, @RequestBody String title) {
        userService.updateTitle(userId, title);
    }

    @PutMapping("/{userId}/firstName")
    public void updateFirstName(@PathVariable Long userId, @RequestBody String firstName) {
        userService.updateFirstName(userId, firstName);
    }

    @PutMapping("/{userId}/lastName")
    public void updateLastName(@PathVariable Long userId, @RequestBody String lastName) {
        userService.updateLastName(userId, lastName);
    }

    @PutMapping("/{userId}/email")
    public void updateEmail(@PathVariable Long userId, @RequestBody String email) {
        userService.updateEmail(userId, email);
    }

    @PutMapping("/{userId}/phoneNumber")
    public void updatePhoneNumber(@PathVariable Long userId, @RequestBody String phoneNumber) {
        userService.updatePhoneNumber(userId, phoneNumber);
    }

    @PutMapping("/{userId}/mobileNumber")
    public void updateMobileNumber(@PathVariable Long userId, @RequestBody String mobileNumber) {
        userService.updateMobileNumber(userId, mobileNumber);
    }

    @PostMapping
    public User saveUser(@RequestBody User user) {
        return userService.save(user);
    }

    @DeleteMapping("/{userId}")
    public void deleteUser(@PathVariable Long userId) {
        User user = new User();
        user.setId(userId);
        userService.delete(user);
    }

    @PutMapping("/{userId}/changePassword")
    public void changePassword(@PathVariable Long userId, @RequestBody String newPassword) {
        userService.changePassword(userId, newPassword);
    }
}