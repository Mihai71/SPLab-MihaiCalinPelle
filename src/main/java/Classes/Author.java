package Classes;

// Clasa care reprezinta un autor cu nume si prenume
public class Author {

    // Numele autorului
    private String name;

    // Prenumele autorului
    private String surname;

    // Constructor care initializeaza numele si prenumele
    public Author(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    // Metoda pentru afisarea autorului in consola
    public void print() {
        System.out.println("Author: " + this.name + " " + this.surname);
    }
}