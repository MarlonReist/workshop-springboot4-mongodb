package com.marlondev.workshopmongodb.services;

import com.marlondev.workshopmongodb.domain.Post;
import com.marlondev.workshopmongodb.domain.User;
import com.marlondev.workshopmongodb.dto.UserDTO;
import com.marlondev.workshopmongodb.repository.PostRepository;
import com.marlondev.workshopmongodb.repository.UserRepository;
import com.marlondev.workshopmongodb.services.exceptions.ObjectNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PostService {

    @Autowired
    private PostRepository repo;

    public Post findById(String id) {
        Optional<Post> obj = repo.findById(id);
        return obj.orElseThrow(() -> new ObjectNotFoundException("Object not found"));
    }

    public List<Post> findByTitle(String text){
        return repo.findByTitleContainingIgnoreCase(text);
    }
}