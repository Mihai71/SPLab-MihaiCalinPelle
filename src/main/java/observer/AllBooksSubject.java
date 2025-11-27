package observer;

import Classes.Book;
import java.util.ArrayList;
import java.util.List;

/**
 * Clasa ține lista tuturor observer-ilor și îi notifică atunci când apare o schimbare.
 */
public class AllBooksSubject {

    // Lista cu toate obiectele care ascultă (Observeri)
    private final List<Observer> observers = new ArrayList<>();

    /**
     * Metodă prin care un observer se poate abona.
     * Când apare o modificare, acesta va fi notificat.
     */
    public void attach(Observer observer) {
        if (observer != null && !observers.contains(observer)) {
            observers.add(observer);
        }
    }

    /**
     * Metodă care notifică toți observerii.
     * @param book — cartea la care s-a produs o schimbare
     */
    public void notifyObservers(Book book) {
        for (Observer o : observers) {
            o.update(book);
        }
    }
}
