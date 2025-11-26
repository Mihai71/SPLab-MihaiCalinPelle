package Classes;

import java.util.ArrayList;
import java.util.List;

// Clasa care reprezinta o carte, implementand interfata Element
public class Book implements Element {

    // Titlul cartii
    private String title;

    // Lista de autori ai cartii
    private List<Author> authors = new ArrayList<>();

    // Continutul cartii (poate contine alte elemente)
    private List<Element> elements = new ArrayList<>();

    // Constructor care initializeaza titlul
    public Book(String title) {
        this.title = title;
    }

    // Adauga un autor la lista de autori
    public void addAuthor(Author author) {
        authors.add(author);
    }

    // Adauga un element la continutul cartii
    public void addContent(Element element) {
        elements.add(element);
    }

    // Afiseaza informatii despre carte si continutul sau
    @Override
    public void print() {
        System.out.println("Book: " + title);
        System.out.println("\nAuthors:");
        for (Author a : authors) {
            a.print();
        }
        System.out.println(); // Linie goala
        for (Element e : elements) {
            e.print();
        }
    }

    // Metoda din interfata Element pentru a adauga un element
    @Override
    public void add(Element e) {
        elements.add(e);
    }

    // Metoda din interfata Element pentru a elimina un element
    @Override
    public void remove(Element e) {
        elements.remove(e);
    }

    // Metoda din interfata Element pentru a obtine un element dupa index
    @Override
    public Element get(int index) {
        return elements.get(index);
    }
}
