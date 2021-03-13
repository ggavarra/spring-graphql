package com.gg.spring.graphql.resolvers;

import com.gg.spring.graphql.dao.PostDao;
import com.gg.spring.graphql.model.Author;
import com.gg.spring.graphql.model.Post;

import java.util.List;

public class AuthorResolver {
    private final PostDao postDao;

    public AuthorResolver(PostDao postDao) {
        this.postDao = postDao;
    }

    public List<Post> getPosts(Author author) {
        return postDao.getAuthorPosts(author.getId());
    }
}
