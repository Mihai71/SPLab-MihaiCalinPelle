import java.util.ArrayList;
import java.util.List;

public class SubChapter implements Element {
    private String name;
    private List<Element> elements;

    public SubChapter(String name) {
        this.name = name;
        this.elements = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void addParagraph(Paragraph paragraph) {
        elements.add(paragraph);
    }

    public void addImage(Image image) {
        elements.add(image);
    }

    public void addTable(Table table) {
        elements.add(table);
    }

    public void addSubChapter(SubChapter subChapter) {
        elements.add(subChapter);
    }

    public void add(Element element) {
        elements.add(element);
    }

    public List<Element> getElements() {
        return elements;
    }

    @Override
    public void print() {
        System.out.println("Subchapter: " + name);
        for (Element e : elements) {
            e.print();
        }
    }
}
