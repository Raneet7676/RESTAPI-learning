package com.example.RESTAPI.repository;

import com.example.RESTAPI.entity.UserDetails;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface UserRepository extends JpaRepository<UserDetails , Long> {

}
