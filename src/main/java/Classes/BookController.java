package Classes;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.*;

// Controller Spring pentru gestionarea cartilor
@Component
@RestController
@RequestMapping("/books")
public class BookController {

    // Endpoint pentru salvarea unei carti
    @PostMapping
    public String saveBook() {
        Command cmd = new SaveBook(); // Creeaza comanda pentru salvare
        cmd.execute();                // Executa comanda
        return "Salvarea realizata";  // Returneaza mesaj de succes
    }

    // Endpoint pentru afisarea unei carti dupa ID
    @GetMapping("/{id}")
    public String showBook(@PathVariable String id) {
        Command cmd = new ShowBook();    // Creeaza comanda pentru afisare
        cmd.execute();                   // Executa comanda
        return "Afisarea efectuata pentru cartea cu ID: " + id + " ✅"; // Mesaj
    }

    // Endpoint pentru listarea tuturor cartilor
    @GetMapping
    public String getAllBooks() {
        return "Final, functioneaza tot"; // Returneaza mesaj generic
    }
}
