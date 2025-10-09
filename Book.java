import java.util.ArrayList;
import java.util.List;

public class Book {
    private String title;
    private TableOfContents tableOfContents;
    private List<Author> authors;
    private List<Chapter> chapters;

    public Book(String title) {
        this.title = title;
        this.authors = new ArrayList<>();
        this.chapters = new ArrayList<>();
        this.tableOfContents = new TableOfContents();
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

    public void addChapter(Chapter chapter) {
        chapters.add(chapter);
    }

    public List<Author> getAuthors() {
        return authors;
    }

    public List<Chapter> getChapters() {
        return chapters;
    }

    public TableOfContents getTableOfContents() {
        return tableOfContents;
    }

    public void print() {
        System.out.println("Book: " + title);
        for (Author a : authors) {
            a.print();
        }
        tableOfContents.print();
        for (Chapter c : chapters) {
            c.print();
        }
    }
}
