package com.gg.spring.graphql.model;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class Author {
    private String id;
    private String name;
    private String thumbnail;
    private List<Post> posts;
}



