package com.example.Library.controller;


import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.Library.entity.Author;
import com.example.Library.service.AuthorServiceImp;

@RestController
@RequestMapping("/library")
public class AuthorConrtroller {

	@Autowired
	AuthorServiceImp authorserviceImp;
	
	@PostMapping("/post")
	public Author createAuthor(@RequestBody Author author) {
		return authorserviceImp.create(author);
	}
	@GetMapping("/get/{id}")
	public Optional<Author> get(@PathVariable int id){
	return authorserviceImp.get(id);
	}
  
  @PutMapping("/put")
public Author update(@RequestBody Author author) {
	  return authorserviceImp.update(author);
  }
  @DeleteMapping("/delete/{id}")
  public String delete(@PathVariable int id) {
	 return authorserviceImp.delete(id);
	
  } 
}
