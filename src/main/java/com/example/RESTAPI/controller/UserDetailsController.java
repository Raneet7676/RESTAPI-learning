package com.example.RESTAPI.controller;

import com.example.RESTAPI.DTO.response.AllUserDetails;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/user")
public class UserDetailsController {

    @GetMapping("/all")
    public ResponseEntity<AllUserDetails> getAllDetails() {

        return ResponseEntity.ok();
    }

}
