package com.example.Library.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Library.entity.Author;
import com.example.Library.repository.AuthorRepository;

@Service
public class AuthorService implements AuthorServiceImp {
	@Autowired
	AuthorRepository authorRepo;

	@Override
	public Author create(Author author) {
		return authorRepo.save(author);

	}

	
	@Override
	public Author update(Author author) {
		return authorRepo.save(author);

	}

	@Override
	public String delete(int id) {
	authorRepo.deleteById(id);
		return "deleted";
	}


	@Override
	public Optional<Author> get(int id) {	
		return authorRepo.findById(id);
	}


	} 																																																																																																																																																																																																																																																																																																																																																		


