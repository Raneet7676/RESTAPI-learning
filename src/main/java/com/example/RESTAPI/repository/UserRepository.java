package com.example.RESTAPI.repository;

import com.example.RESTAPI.entity.UserDetails;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<UserDetails , Long> {

}
