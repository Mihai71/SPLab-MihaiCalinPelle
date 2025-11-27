package Classes;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/")
    public String home() {
        return "Merge web-ul!";
    }
}
/// clasa temporara, doar sa vad ca merge webul
