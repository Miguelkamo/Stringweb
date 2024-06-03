package aplicacion_web.spring_vsc;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

@RestController
public class HelloController {

    @GetMapping("/hello")
    public String hello() {
        return "¡Hola, mundo!";
    }

    @GetMapping("/time")
    public String getTime() {
        LocalDateTime now = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
        String formattedDateTime = now.format(formatter);
        return "La fecha y hora actual es: " + formattedDateTime;
    }
}
