package kata1;
import java.util.Date;
/**
 *
 * @author agonz
 */
public class Person {
    private final String name;
    private final Date birthdate;
    
    public Person(String nombre, Date fecha) {
        name = nombre;
        birthdate = fecha;
    }

    public Date getBirthdate() {
        return birthdate;
    }

    public String getName() {
        return name;
    }
    
    public int getAge() {
        return (int)((new Date().getTime() - birthdate.getTime())/31536000000L);
    }
}
