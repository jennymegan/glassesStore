package com.example.servingwebcontent.controllers;
import com.example.servingwebcontent.models.Book;
import com.example.servingwebcontent.services.BookService;
import org.springframework.web.bind.annotation.*;
import org.springframework.beans.factory.annotation.Autowired;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.List;


@RestController
public class BookController
{
    @Autowired
    BookService bookService;

    private static final Logger logger= LoggerFactory.getLogger(BookController.class);

    @CrossOrigin
    @PostMapping("/book")
    private void addBook(@RequestBody Book book) {
        bookService.addNew(book);
    }

    @CrossOrigin
    @GetMapping("/book")
    public List<Book> getAllBooks() {
        return bookService.getAllBooks();
    }

    @CrossOrigin
    @GetMapping("/book/{id}")
    private Book getBook(@PathVariable("id") int id) {
        return bookService.getBookById(id);
    }

    @CrossOrigin
    @DeleteMapping("/book/{id}")
    private void deleteBook(@PathVariable("id") int id) {
        bookService.delete(id);
    }

}
