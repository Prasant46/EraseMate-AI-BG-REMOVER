package com.removebg.service;

import com.removebg.dto.UserDTO;

public interface UserService {

    UserDTO saveUser(UserDTO userDTO);

    UserDTO getUserByClerkId(String clerkId);

    void deleteUserByClerkId(String clerkId);
}
