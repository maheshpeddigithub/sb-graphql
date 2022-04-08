package com.example.graphql.resolver;

import com.coxautodev.graphql.tools.GraphQLQueryResolver;
import com.example.graphql.model.Author;
import com.example.graphql.repository.AuthorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class QueryAuthor implements GraphQLQueryResolver {

    @Autowired
    private AuthorRepository repository;

    public List<Author> findAllAuthors() {
        return repository.findAll();
    }

}
