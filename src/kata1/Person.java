package kata1;
import java.time.LocalDate;
import java.time.Period;
/**
 *
 * @author agonz
 */
public class Person {
    private final String name;
    private final LocalDate birthdate;
    private final long MILISECONDS_PER_YEAR = (long) (1000*60*60*24*365.25);
    
    public Person(String nombre, LocalDate fecha) {
        name = nombre;
        birthdate = fecha;
    }

    public LocalDate getBirthdate() {
        return birthdate;
    }

    public String getName() {
        return name;
    }
    
    public int getAge() {
        LocalDate fa = LocalDate.now();
        return (int)(Period.between(birthdate, fa).getYears());
    }
    
}
