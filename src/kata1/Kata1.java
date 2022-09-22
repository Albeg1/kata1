package kata1;
import java.util.Calendar;
import java.util.GregorianCalendar;
/**
 *
 * @author agonz
 */
public class Kata1 {

    public static void main(String[] args) {
        Calendar date;
        date = GregorianCalendar.getInstance();
        date.set(2002, 1, 11);
        Person person = new Person("Rubén", date);
        System.out.println(person.getName() + " tiene " + person.getAge() + " Años.");
    }
    
}
