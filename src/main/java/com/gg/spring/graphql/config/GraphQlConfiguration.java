package com.gg.spring.graphql.config;


import java.util.ArrayList;
import java.util.List;

import com.gg.spring.graphql.dao.AuthorDao;
import com.gg.spring.graphql.dao.PostDao;
import com.gg.spring.graphql.model.Author;
import com.gg.spring.graphql.model.Post;
import com.gg.spring.graphql.query.Query;
import com.gg.spring.graphql.resolvers.AuthorResolver;
import com.gg.spring.graphql.resolvers.PostMutationResolver;
import com.gg.spring.graphql.resolvers.PostResolver;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@Slf4j
public class GraphQlConfiguration {
    @Bean
    public PostDao postDao() {
        List<Post> posts = new ArrayList<>();
        for (int postId = 0; postId < 10; ++postId) {
            for (int authorId = 0; authorId < 10; ++authorId) {
                Post post = new Post();
                post.setId("Post" + authorId + postId);
                post.setTitle("Post " + authorId + ":" + postId);
                post.setText("Post " + postId + " + by author " + authorId);
                post.setAuthorId("Author" + authorId);
                posts.add(post);
            }
        }
        log.info("Loaded posts :"+posts);
        return new PostDao(posts);
    }

    @Bean
    public AuthorDao authorDao() {
        List<Author> authors = new ArrayList<>();
        for (int authorId = 0; authorId < 10; ++authorId) {
            Author author = new Author();
            author.setId("Author" + authorId);
            author.setName("Author " + authorId);
            author.setThumbnail("http://example.com/authors/" + authorId);
            authors.add(author);
        }
        log.info("Loaded authors :"+authors);
        return new AuthorDao(authors);
    }

    @Bean
    public PostResolver postResolver(AuthorDao authorDao) {
        return new PostResolver(authorDao);
    }

    @Bean
    public AuthorResolver authorResolver(PostDao postDao) {
        return new AuthorResolver(postDao);
    }

    @Bean
    public Query query(PostDao postDao) {
        return new Query(postDao);
    }
    
    @Bean
    public PostMutationResolver mutationResolverResolver(PostDao postDao) {
        return new PostMutationResolver(postDao);
    }
    
}