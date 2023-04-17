package com.omnichannel.Omnichannel.service;

import com.example.omnichannel.entity.User;

public interface UserService {
    User createUser(User user);

    User getUserById(Long id);
}