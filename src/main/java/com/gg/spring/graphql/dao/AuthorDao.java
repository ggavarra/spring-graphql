package com.gg.spring.graphql.dao;

import com.gg.spring.graphql.model.Author;

import java.util.List;

public class AuthorDao {

    private final List<Author> authors;

    public AuthorDao(List<Author> authors) {
        this.authors = authors;
    }

    public Author getAuthor(String id) {
        return authors.stream().filter(author -> id.equals(author.getId())).findFirst().get();
    }

}

