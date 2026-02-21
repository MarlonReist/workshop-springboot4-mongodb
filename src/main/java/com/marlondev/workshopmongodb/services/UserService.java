package com.marlondev.workshopmongodb.services;

import java.util.List;

import com.marlondev.workshopmongodb.domain.User;
import com.marlondev.workshopmongodb.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    private UserRepository repo;

    public List<User> findAll() {
        return repo.findAll();
    }
}