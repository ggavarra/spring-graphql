/*
package com.gg.spring.graphql.post;

import com.gg.spring.graphql.dao.AuthorDao;
import com.gg.spring.graphql.model.Author;
import com.gg.spring.graphql.model.Post;
import com.gg.spring.graphql.resolvers.PostResolver;
import com.graphql.spring.boot.test.GraphQLTest;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;

import java.util.List;

import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.when;

@GraphQLTest
public class PostTest {
    public PostTest() {
        
    }
    Post post = new Post();
    Author author=new Author();
    
    @Mock
    AuthorDao authorDao;
    
    @BeforeEach
    void setUp() {
        
        post.setTitle("ABC");
        post.setCategory("Fiction");
        post.setAuthorId("1");
        post.setText("This is fiction book!");
        
        author.setId("1");
        author.setName("GGAVARRA");
        author.setPosts(List.of(post));
    }

    @Test
    void getRecentPosts(){
        
        when(authorDao.getAuthor(any())).thenReturn(author);
        PostResolver postResolver=new PostResolver(authorDao);
        postResolver.getAuthor(post);
        
    }
}
*/
