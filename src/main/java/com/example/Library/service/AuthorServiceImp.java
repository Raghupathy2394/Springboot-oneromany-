package com.example.Library.service;

import java.util.List;
import java.util.Optional;

import com.example.Library.entity.Author;

public interface AuthorServiceImp {

	Author create(Author author);


	Author update(Author author);

	String  delete(int id);


	Optional<Author> get(int id);


	List<Author> createall(List<Author> author);

}
