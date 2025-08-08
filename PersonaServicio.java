import com.backend1.apirest.Model.Person;
import com.backend1.apirest.Repository.PersonRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class PersonaServicio {
    //Inyección del repository con @RequiredArgsConstructor de lombok
    private final PersonRepository personRepository;
/* Asi sería la inyección de dependencia con @Autowired desde el repository "PersonRepository"
@Autowired
private PersonRepository personRepository;
 */

    public  void createPersona(Person person){
        personRepository.save(person);

    }

}
