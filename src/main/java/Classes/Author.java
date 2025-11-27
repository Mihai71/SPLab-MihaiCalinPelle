package Classes;

import jakarta.persistence.*;
import java.util.List;

@Entity
public class Author {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    // Basic fields for author identity
    private String name;
    private String surname;

    // One author can be linked to multiple books
    @OneToMany(mappedBy = "author")
    private List<Book> books;

    // Empty constructor required by JPA
    public Author() {}

    // Convenience constructor for creating authors quickly
    public Author(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    // Simple print method for debugging
    public void print() {
        System.out.println("Author: " + this.name + " " + this.surname);
    }

    // Getters and setters
    public Long getId() { return id; }
    public String getName() { return name; }
    public String getSurname() { return surname; }

    public void setName(String name) { this.name = name; }
    public void setSurname(String surname) { this.surname = surname; }
}
