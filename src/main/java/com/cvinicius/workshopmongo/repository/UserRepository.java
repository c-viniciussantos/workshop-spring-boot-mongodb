package com.cvinicius.workshopmongo.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.cvinicius.workshopmongo.domain.User;

@Repository
public interface UserRepository extends MongoRepository<User, String>{
}
