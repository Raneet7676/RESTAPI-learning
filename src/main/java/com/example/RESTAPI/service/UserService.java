package com.example.RESTAPI.service;


import com.example.RESTAPI.DTO.request.InputUserDetails;
import com.example.RESTAPI.DTO.response.AllUserDetails;
import com.example.RESTAPI.entity.UserDetails;
import com.example.RESTAPI.repository.UserRepository;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private ModelMapper mapper;

//// fetching all data from database and converting to DTO
//    public List<AllUserDetails> fetchDetails() {
//        List<UserDetails> users = userRepository.findAll();
//        List<AllUserDetails> userDetails = new ArrayList<>();
//
//        for (UserDetails user : users) {
//            userDetails.add(mapper.map(user, AllUserDetails.class));
//        }
//
//        // alternative option using streams API
//
////        public List<AllUserDetails> fetchDetails() {
////            List<UserDetails> users = userRepository.findAll();
////
////            List<AllUserDetails> userDetails = users.stream()
////                    .map(user -> mapper.map(user, AllUserDetails.class))
////                    .collect(Collectors.toList());
////
////            return userDetails;
////        }
//
//
//        return userDetails;
//    }

    public List<AllUserDetails> fetchDetails() {
        return userRepository.findAll()
                .stream()
                .map(user -> mapper.map(user, AllUserDetails.class))
                .collect(Collectors.toList());
    }

    public void addDetails(InputUserDetails inputDetails){
        UserDetails detail = mapper.map(inputDetails, UserDetails.class);

        userRepository.save(detail);
    }

}