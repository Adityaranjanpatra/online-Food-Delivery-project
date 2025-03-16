package com.aditya.foodiesapi.service;

import com.aditya.foodiesapi.io.UserRequest;
import com.aditya.foodiesapi.io.UserResponse;

public interface UserService {

    UserResponse registerUser(UserRequest request);

    String findByUserId();
}
