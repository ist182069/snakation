package jbras.snakation;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class SnakeController {

    @GetMapping("/snake")
    public String index()
    {
        return "Greetings from Spring Boot!";
    }

}
