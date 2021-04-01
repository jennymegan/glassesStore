package com.example.servingwebcontent.repositories;
import com.example.servingwebcontent.models.Book;
import org.springframework.data.repository.CrudRepository;

//repository that extends CrudRepository
public interface BookRepository extends CrudRepository<Book, Integer>
{
}
