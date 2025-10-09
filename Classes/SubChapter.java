import java.util.ArrayList;
import java.util.List;

public class SubChapter {
    private String name;
    private List<Paragraph> paragraphs;
    private List<Image> images;
    private List<Table> tables;
    private List<SubChapter> subChapters; // pentru sub-subcapitole

    public SubChapter(String name) {
        this.name = name;
        this.paragraphs = new ArrayList<>();
        this.images = new ArrayList<>();
        this.tables = new ArrayList<>();
        this.subChapters = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void addParagraph(Paragraph paragraph) {
        paragraphs.add(paragraph);
    }

    public void addImage(Image image) {
        images.add(image);
    }

    public void addTable(Table table) {
        tables.add(table);
    }

    public void addSubChapter(SubChapter subChapter) {
        subChapters.add(subChapter);
    }

    public List<Paragraph> getParagraphs() {
        return paragraphs;
    }

    public List<Image> getImages() {
        return images;
    }

    public List<Table> getTables() {
        return tables;
    }

    public List<SubChapter> getSubChapters() {
        return subChapters;
    }

    public void print() {
        System.out.println(" Subchapter: " + name);

        for (Paragraph p : paragraphs) {
            p.print();
        }
        for (Image img : images) {
            img.print();
        }
        for (Table t : tables) {
            t.print();
        }
        for (SubChapter sc : subChapters) {
            sc.print();
        }
    }
}
