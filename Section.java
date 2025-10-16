import java.util.ArrayList;
import java.util.List;

public class Section implements Element {
    private String title;
    private List<Element> elements;

    public Section(String title) {
        this.title = title;
        this.elements = new ArrayList<>();
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    // adaugă un element (Paragraph, Image, Table, Section)
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

    @Override
    public void print() {
        System.out.println("Section: " + title);
        for (Element e : elements) {
            e.print();
        }
    }
}
