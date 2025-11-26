package Classes;

// Clasa care reprezinta un paragraf, implementand interfata Element
public class Paragraph implements Element {

    // Textul paragrafului
    private String text;

    // Strategia de aliniere a textului (optional)
    private AlignStrategy textAlignment;

    // Constructor care initializeaza textul paragrafului
    public Paragraph(String text) {
        this.text = text;
    }

    // Getter pentru text
    public String getText() {
        return text;
    }

    // Seteaza strategia de aliniere
    public void setAlignStrategy(AlignStrategy alignStrategy) {
        this.textAlignment = alignStrategy;
    }

    // Afiseaza paragraf, folosind strategia de aliniere daca exista
    @Override
    public void print() {
        if (textAlignment != null) {
            textAlignment.render(this, 40); // Aplica alinierea
        } else {
            System.out.println("Paragraph: " + text); // Afisare simpla
        }
    }

    // Metode din interfata Element, neutilizate pentru paragraf
    @Override
    public void add(Element element) {}

    @Override
    public void remove(Element element) {}

    @Override
    public Element get(int index) {
        return null;
    }
}
