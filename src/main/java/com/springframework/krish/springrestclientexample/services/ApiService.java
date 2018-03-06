package com.springframework.krish.springrestclientexample.services;

import com.springframework.krish.api.domain.User;


import java.util.List;

public interface ApiService {

    List<User> getUsers(Integer limit);
}
