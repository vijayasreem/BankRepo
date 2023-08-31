package com.sacral.controller;

import com.sacral.service.UserStoryService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user-story")
public class UserStoryController {

    private UserStoryService service;

    public UserStoryController(UserStoryService service){
        this.service = service;
    }

    @RequestMapping("/run")
    public void runUserStory(){
        service.runUserStory();
    }

    @RequestMapping("/payment")
    public void runPaymentVerification(){
        service.runPaymentVerification();
    }

    @RequestMapping("/assessment")
    public void runAssessmentVerification(){
        service.runAssessmentVerification();
    }
}