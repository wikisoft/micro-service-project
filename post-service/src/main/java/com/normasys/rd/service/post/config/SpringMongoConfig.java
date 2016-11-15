package com.normasys.rd.service.post.config;

import org.springframework.context.annotation.Bean;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

import com.normasys.rd.service.post.dao.listener.CommentCascadeDeleteMongoEventListener;

@EnableMongoRepositories(basePackages = { "com.normasys.rd.service.post.dao" })
public class SpringMongoConfig {

    public @Bean CommentCascadeDeleteMongoEventListener commentCascadingMongoEventListener() {
	return new CommentCascadeDeleteMongoEventListener();
    }

}
