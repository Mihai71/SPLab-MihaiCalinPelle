import java.util.ArrayList;
import java.util.List;

public class Chapter {
    private String name;
    private List<SubChapter> subChapters;

    public Chapter(String name) {
        this.name = name;
        this.subChapters = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void addSubChapter(SubChapter subChapter) {
        subChapters.add(subChapter);
    }

    public List<SubChapter> getSubChapters() {
        return subChapters;
    }

    public void print() {
        System.out.println("Chapter: " + name);
        for (SubChapter sub : subChapters) {
            sub.print();
        }
    }
}
