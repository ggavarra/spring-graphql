package com.gg.spring.graphql.query;

import com.coxautodev.graphql.tools.GraphQLQueryResolver;
import com.gg.spring.graphql.dao.PostDao;
import com.gg.spring.graphql.model.Post;

import java.util.List;

public class Query implements GraphQLQueryResolver {
    private final PostDao postDao;

    public Query(PostDao postDao) {
        this.postDao = postDao;
    }

    public List<Post> getRecentPosts(int count, int offset) {
        return postDao.getRecentPosts(count, offset);
    }
    
}
