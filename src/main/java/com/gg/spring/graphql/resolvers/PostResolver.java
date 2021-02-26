package com.gg.spring.graphql.resolvers;

import com.coxautodev.graphql.tools.GraphQLResolver;
import com.gg.spring.graphql.dao.AuthorDao;
import com.gg.spring.graphql.dao.PostDao;
import com.gg.spring.graphql.model.Author;
import com.gg.spring.graphql.model.Post;

public class PostResolver implements GraphQLResolver<Post> {
    private AuthorDao authorDao;

    public PostResolver(AuthorDao authorDao) {
        this.authorDao = authorDao;
    }

    public Author getAuthor(Post post) {
        return authorDao.getAuthor(post.getAuthorId());
    }

}
