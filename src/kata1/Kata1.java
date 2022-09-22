package kata1;
import java.time.LocalDate;
/**
 *
 * @author agonz
 */
public class Kata1 {

    public static void main(String[] args) {
        LocalDate date;
        date = LocalDate.of(2002, 1, 11);
        Person person = new Person("Rubén", date);
        System.out.println(person.getName() + " tiene " + person.getAge() + " Años.");
    }
    
}
