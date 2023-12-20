package com.udemy.spring.react.springreact.controller;
import com.udemy.spring.react.springreact.dto.BookDto;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BookController {
	@GetMapping("api/v1/books")
	public ResponseEntity<List<BookDto>>getBooks(){
		BookDto book = BookDto.builder()
				.title("My First book title")
				.build();
		List <BookDto> books = new ArrayList<>();	
		books.add(book);
		return ResponseEntity.ok(books);
		}

}

