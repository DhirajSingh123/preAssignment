package com.user.preassignments.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.user.preassignments.models.Users;


@Repository
public interface DbRepository extends MongoRepository<Users, Integer> {

}
