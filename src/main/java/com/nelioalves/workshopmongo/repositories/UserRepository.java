package com.nelioalves.workshopmongo.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.nelioalves.workshopmongo.domain.User;

public interface UserRepository extends MongoRepository<User, String>  {

}
