package com.marlondev.workshopmongodb.repository;

import com.marlondev.workshopmongodb.domain.Post;
import com.marlondev.workshopmongodb.domain.User;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface PostRepository extends MongoRepository<Post, String> {

}