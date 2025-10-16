public class TableOfContents implements Element {

    public TableOfContents() {
    }

    @Override
    public void print() {
        System.out.println("Table of Contents");
    }

    @Override
    public void add(Element e) {
        throw new UnsupportedOperationException("Cannot add element to TableOfContents");
    }

    @Override
    public void remove(Element e) {
        throw new UnsupportedOperationException("Cannot remove element from TableOfContents");
    }

    @Override
    public Element get(int index) {
        throw new UnsupportedOperationException("TableOfContents has no child elements");
    }
}
