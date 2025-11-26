package Classes;

import java.util.ArrayList;
import java.util.List;

// Clasa care reprezinta o sectiune, implementand interfata Element
public class Section implements Element {

    // Titlul sectiunii
    private String title;

    // Lista de elemente copil (paragrafe, subsectiuni etc.)
    private List<Element> children = new ArrayList<>();

    // Constructor care initializeaza titlul sectiunii
    public Section(String title) {
        this.title = title;
    }

    // Afiseaza titlul sectiunii si toate elementele copil
    @Override
    public void print() {
        System.out.println(title);
        for (Element e : children) {
            e.print();
        }
    }

    // Adauga un element copil la sectiune
    @Override
    public void add(Element e) {
        children.add(e);
    }

    // Elimina un element copil din sectiune
    @Override
    public void remove(Element e) {
        children.remove(e);
    }

    // Returneaza un element copil dupa index
    @Override
    public Element get(int index) {
        return children.get(index);
    }
}
