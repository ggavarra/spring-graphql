package com.gg.spring.graphql.resolvers;

import com.coxautodev.graphql.tools.GraphQLMutationResolver;
import com.gg.spring.graphql.dao.PostDao;
import com.gg.spring.graphql.model.Post;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class PostMutationResolver implements GraphQLMutationResolver {
    
    private final PostDao postDao;
    
    public PostMutationResolver(PostDao postDao) {
        this.postDao=postDao;
    }

    public void savePost(String id, Post post){
        postDao.savePost(post);
    }

    public Post writePost(String title,String text,String category, String author){
        Post post=new Post();
        post.setTitle(title);
        post.setText(text);
        post.setCategory(category);
        postDao.savePost(post);
        return post;
    }
}
