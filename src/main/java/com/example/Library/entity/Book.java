package com.example.Library.entity;

import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonBackReference;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Book {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int bid;
	private String title;
	private int price;

//	@OneToOne(mappedBy = "book")
//  private Author author;

//		@OneToMany(cascade = CascadeType.ALL,mappedBy = "books")
//		private List<Author> author;

	  @ManyToOne
	    @JoinColumn(name = "author_id")
	    @JsonBackReference
	    private Author author;
	}
