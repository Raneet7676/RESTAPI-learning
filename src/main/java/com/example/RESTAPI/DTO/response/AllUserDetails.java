package com.example.RESTAPI.DTO.response;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class AllUserDetails {

    // getters and setters (REQUIRED)
    private Long id;
    private String firstName;
    private String lastName;
    private String email;
    private String city;
    private String location;
    private String occupation;

    // ✅ THIS MUST EXIST
    public AllUserDetails() {
    }

}

