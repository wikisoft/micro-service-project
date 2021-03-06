package com.normasys.rd.service.post.dao;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.normasys.rd.service.post.model.Person;

@RepositoryRestResource
public interface PersonRepository extends MongoRepository<Person, String> {

    List<Person> findByName(@Param("name") String name);

}
