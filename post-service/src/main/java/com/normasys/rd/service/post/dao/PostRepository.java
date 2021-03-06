package com.normasys.rd.service.post.dao;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.normasys.rd.service.post.model.Post;

@RepositoryRestResource
public interface PostRepository extends MongoRepository<Post, String> {

    @Query("{ 'title' : ?0 }")
    List<Post> findByPostTitle(@Param("title") String title);

}
