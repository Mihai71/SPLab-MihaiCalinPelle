package Classes;

import jakarta.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Book implements Element {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    // Basic book title
    private String title;

    // Many books can belong to one author
    @ManyToOne
    private Author author;

    // Transient list of elements (not stored in DB)
    @Transient
    private List<Element> elements = new ArrayList<>();

    // Required empty constructor for JPA
    public Book() {}

    // Constructor used when creating a book manually
    public Book(String title) {
        this.title = title;
    }

    // Adds an Element to the in-memory list
    public void addContent(Element element) {
        elements.add(element);
    }

    // Print method used for debugging or console output
    @Override
    public void print() {
        System.out.println("Book: " + title);

        // Print author if available
        if (author != null) {
            author.print();
        }

        // Print all child elements
        for (Element e : elements) {
            e.print();
        }
    }

    // Composite pattern methods
    @Override
    public void add(Element e) {
        elements.add(e);
    }

    @Override
    public void remove(Element e) {
        elements.remove(e);
    }

    @Override
    public Element get(int index) {
        return elements.get(index);
    }

    // Getters and setters
    public Long getId() { return id; }
    public String getTitle() { return title; }
    public void setTitle(String title) { this.title = title; }

    public Author getAuthor() { return author; }
    public void setAuthor(Author author) { this.author = author; }
}
