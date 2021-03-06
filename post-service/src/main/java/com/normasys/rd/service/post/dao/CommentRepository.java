package com.normasys.rd.service.post.dao;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.normasys.rd.service.post.model.Comment;

@RepositoryRestResource
public interface CommentRepository extends MongoRepository<Comment, String> {

}
