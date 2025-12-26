package com.example.RESTAPI.controller;

import com.example.RESTAPI.DTO.response.AllUserDetails;
import com.example.RESTAPI.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;




@RestController
@RequestMapping("/users")
public class UserDetailsController {


    @Autowired
    private UserService userService;

    @GetMapping("/fetchAll")
    public ResponseEntity<List<AllUserDetails>> getAllDetails() {

        List<AllUserDetails> userDetails = userService.fetchDetails();
        return ResponseEntity.ok(userDetails);

    }



    @GetMapping("/string")
    public String test() {
        return "this is testing api";
    }

}
