package com.example.simplecurd.domain.Repository;

import com.example.simplecurd.domain.Book;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BookRespository extends CrudRepository<Book, Long> {
}
