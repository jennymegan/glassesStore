package com.example.servingwebcontent.repositories;
import com.example.servingwebcontent.models.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

//repository that extends CrudRepository
public interface BookRepository extends JpaRepository<Book, Integer>
{
}
