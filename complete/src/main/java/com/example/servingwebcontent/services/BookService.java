package com.example.servingwebcontent.services;

import com.example.servingwebcontent.models.Book;
import com.example.servingwebcontent.repositories.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

//business logic
@Service
public class BookService
{
    @Autowired
    BookRepository bookrepo;

    public List<Book> getAllBooks(){
        List<Book> books = new ArrayList<Book>();
        bookrepo.findAll().forEach(book -> books.add(book));
        return books;
    }

    public void addNew(Book book){
        bookrepo.save(book);
    }

    public Book getBookById(int id){
        return bookrepo.findById(id).get();
    }

    public void delete(int id){
        bookrepo.deleteById(id);
    }

}
