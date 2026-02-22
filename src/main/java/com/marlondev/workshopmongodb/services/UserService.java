package com.marlondev.workshopmongodb.services;

import java.util.List;

import com.marlondev.workshopmongodb.domain.User;
import com.marlondev.workshopmongodb.repository.UserRepository;
import com.marlondev.workshopmongodb.services.exceptions.ObjectNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.Optional;

@Service
public class UserService {

    @Autowired
    private UserRepository repo;

    public List<User> findAll() {
        return repo.findAll();
    }

    public User findById(String id) {
        Optional<User> obj = repo.findById(id);
        return obj.orElseThrow(() -> new ObjectNotFoundException("Object not found"));
    }

}