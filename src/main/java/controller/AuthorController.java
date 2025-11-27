package controller;

import Classes.Author;
import repository.AuthorRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/authors")
public class AuthorController {

    // Repository-ul care gestioneaza operatiile pe autori
    private final AuthorRepository authorRepository;

    // Injectam repository-ul prin constructor
    public AuthorController(AuthorRepository authorRepository) {
        this.authorRepository = authorRepository;
    }

    // Endpoint GET: returneaza toti autorii din baza de date
    @GetMapping
    public List<Author> getAllAuthors() {
        return authorRepository.findAll();
    }

    // Endpoint POST: adauga un autor nou in baza de date
    @PostMapping
    public Author addAuthor(@RequestBody Author author) {
        return authorRepository.save(author);
    }
}
