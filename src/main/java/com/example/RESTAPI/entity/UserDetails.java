package com.example.RESTAPI.entity;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(
        name = "User_detail"
)
public class UserDetails {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    public UserDetails(String firstName, String lastName, String email, String occupation, String location, String city) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.occupation = occupation;
        this.Location = location;
        this.city = city;
    }

    @Column(
            name = "First_Name",
            nullable = false
    )
    private String firstName;

    @Column(
            name = "Last_Name",
            nullable = false
    )
    private String lastName;

    @Column(
            nullable = false,
            unique = true
    )
    private String email;
    private String occupation;
    private String Location;

    @Column(
            name = "City"
    )
    private String city;
}
