package com.example.Library.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Library.entity.Author;
import com.example.Library.repository.AuthorRepository;
import com.example.Library.repository.BookRepository;

@Service
public class AuthorService implements AuthorServiceImp {
	@Autowired
	AuthorRepository authorRepo;
  @Autowired
   BookRepository bookRepo;
  
  
	@Override
	public Author create(Author author) {
	//	author.getBooks().forEach(book->book.setAuthor(author));
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


	@Override
	public List<Author> createall(List<Author> author) {
		return authorRepo.saveAll(author);
	}


	} 																																																																																																																																																																																																																																																																																																																																																		


