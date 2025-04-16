package com.dpt.spring_cloud_railway.service;

import com.dpt.spring_cloud_railway.domain.model.User;

public interface UserService {


    User findById(Long id);

    User create(User userToCreate);
}
