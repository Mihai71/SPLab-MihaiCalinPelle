package controller;

import Classes.Book;
import repository.BookRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/books")
public class BookController {

    // Repository-ul care gestioneaza operațiile pe carti
    private final BookRepository bookRepository;

    // Injectam repository-ul prin constructor
    public BookController(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    // GET /books → returneaza toate cartile din baza de date
    @GetMapping
    public List<Book> getAllBooks() {
        return bookRepository.findAll();
    }

    // POST /books → adauga o carte noua in baza de date
    @PostMapping
    public Book addBook(@RequestBody Book book) {
        return bookRepository.save(book);
    }
}
