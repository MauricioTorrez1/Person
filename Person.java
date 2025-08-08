import jakarta.annotation.Nonnull;
import jakarta.persistence.Basic;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Nonnull
public class Person {
    //Los nombres de las variables deben coincidir 100% con las del body de la petición
    @Id
    @GeneratedValue
    private Integer id;
    @Basic
    private String firstName;
    private String lastName;
    private String mail;


}
