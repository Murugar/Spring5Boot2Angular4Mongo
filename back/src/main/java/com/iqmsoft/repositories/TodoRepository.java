package com.iqmsoft.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.iqmsoft.models.Todo;

@Repository
public interface TodoRepository extends MongoRepository<Todo, String> {

}