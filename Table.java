public class Table implements Element {
    private String title;

    public Table(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Override
    public void print() {
        System.out.println("Table: " + title);
    }

    // element simplu: nu poate avea copii
    @Override
    public void add(Element e) {
        throw new UnsupportedOperationException("Cannot add element to Table");
    }

    @Override
    public void remove(Element e) {
        throw new UnsupportedOperationException("Cannot remove element from Table");
    }

    @Override
    public Element get(int index) {
        throw new UnsupportedOperationException("Table has no child elements");
    }
}
