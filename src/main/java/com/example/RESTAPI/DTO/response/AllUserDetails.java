package com.example.RESTAPI.DTO.response;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class AllUserDetails {


    public AllUserDetails(String firstName, String lastName, String email, String occupation, String location, String city) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.occupation = occupation;
        Location = location;
        this.city = city;
    }


    private String firstName;
    private String lastName;
    private String email;
    private String occupation;
    private String Location;
    private String city;

}
