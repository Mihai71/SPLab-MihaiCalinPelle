import java.util.ArrayList;
import java.util.List;

public class Book {
    private String title;
    private List<Author> authors;
    private List<Element> elements; // lista de elemente (Section, Paragraph, Image, Table, TableOfContents)

    public Book(String title) {
        this.title = title;
        this.authors = new ArrayList<>();
        this.elements = new ArrayList<>();
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void addAuthor(Author author) {
        authors.add(author);
    }

    public List<Author> getAuthors() {
        return authors;
    }

    public List<Element> getElements() {
        return elements;
    }

    // metoda generica pentru a adauga orice element
    public void addContent(Element element) {
        elements.add(element);
    }

    public void print() {
        System.out.println("Book: " + title);

        for (Author a : authors) {
            a.print();
        }

        for (Element e : elements) {
            e.print();
        }
    }
}
