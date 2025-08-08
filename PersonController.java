//Capa de Presentación (Controller)
import com.backend1.apirest.Model.Person;
import com.backend1.apirest.Service.PersonaServicio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/person")

public class PersonController {
/*
El Orden Correcto de Inyección
La inyección sigue el flujo de una petición a través de la arquitectura en capas. El orden correcto es:

Controller -> Service -> Repository
 */
@Autowired
private PersonaServicio personaServicio;

    @PostMapping
    public void createPersona(@RequestBody Person person){
        personaServicio.createPersona(person);
    }

    @GetMapping
    public String welcome(){
        return "Welcome Spring Security";
    }

}
