package observer;

import Classes.Book;
import org.springframework.web.servlet.mvc.method.annotation.SseEmitter;

/**
 * Observer care trimite notificari catre client folosind Server-Sent Events (SSE).
 * De fiecare data cand se adauga o carte noua, clientul conectat primeste un eveniment SSE.
 */
public class SseObserver implements Observer {

    private final SseEmitter emitter;

    public SseObserver(SseEmitter emitter) {
        this.emitter = emitter;
    }

    /**
     * Metoda apelata automat cand Subject-ul notifica observerii.
     * Trimite catre client un eveniment SSE numit "book-added" care contine obiectul Book.
     */
    @Override
    public void update(Book book) {
        try {
            emitter.send(
                    SseEmitter.event()
                            .name("book-added") // numele evenimentului trimis spre client
                            .data(book)         // continutul (cartea)
            );
        } catch (Exception e) {
            // daca apare o eroare, inchidem emitter-ul corespunzator
            emitter.completeWithError(e);
        }
    }
}
