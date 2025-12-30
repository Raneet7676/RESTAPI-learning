package com.example.RESTAPI.controller;

import com.example.RESTAPI.DTO.request.InputUserDetails;
import com.example.RESTAPI.DTO.response.AllUserDetails;
import com.example.RESTAPI.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

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

    @PostMapping("/add-details")
    public ResponseEntity<String> createUserDetail(@RequestBody InputUserDetails inputDetails){

        userService.addDetails(inputDetails);
        return new ResponseEntity<>("user detail added",HttpStatus.CREATED);
    }



    @GetMapping("/string")
    public String test() {
        return "this is testing api";
    }

}
