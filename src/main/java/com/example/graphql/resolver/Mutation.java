package com.example.graphql.resolver;

import com.coxautodev.graphql.tools.GraphQLMutationResolver;
import com.example.graphql.model.Author;
import com.example.graphql.repository.AuthorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Mutation implements GraphQLMutationResolver {

    @Autowired
    private AuthorRepository repository;

    public Author createAuthor(String name, String address) {
        return repository.save(Author.builder().name(name).address(address).build());
    }

}
