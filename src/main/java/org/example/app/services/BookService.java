package org.example.app.services;

import org.example.web.dto.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookService {

    private final ProjectRepository<Book> bookRepo;

    @Autowired
    public BookService(BookRepository<Book> bookRepo) {
        this.bookRepo = bookRepo;
    }


    public List<Book> getAllBooks() {
        //извлечь все книги
        return bookRepo.retrieveAll();
    }


    public void saveBook(Book book) {
        //сохранить книгу
        bookRepo.store(book);
    }

    public boolean removeBookById(Integer bookIdToRemove) {
        return bookRepo.removeItemById(bookIdToRemove);
    }
}
