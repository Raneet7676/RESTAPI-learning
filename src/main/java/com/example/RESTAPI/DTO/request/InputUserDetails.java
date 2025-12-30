package com.example.RESTAPI.DTO.request;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class InputUserDetails {

    private String firstName;
    private String lastName;
    private String email;
    private String occupation;
    private String Location;
    private String city;

}
