public class Paragraph implements Element {
    private String text;
    private AlignStrategy alignStrategy; // nou

    public Paragraph(String text) {
        this.text = text;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    // setăm strategia de aliniere din exterior
    public void setAlignStrategy(AlignStrategy strategy) {
        this.alignStrategy = strategy;
    }

    @Override
    public void print() {
        if (alignStrategy != null) {
            alignStrategy.render(text);
        } else {
            System.out.println("Paragraph: " + text);
        }
    }

    @Override
    public void add(Element e) {
        throw new UnsupportedOperationException("Cannot add element to Paragraph");
    }

    @Override
    public void remove(Element e) {
        throw new UnsupportedOperationException("Cannot remove element from Paragraph");
    }

    @Override
    public Element get(int index) {
        throw new UnsupportedOperationException("Paragraph has no child elements");
    }
}
