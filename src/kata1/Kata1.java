package kata1;
import java.util.Date;
/**
 *
 * @author agonz
 */
public class Kata1 {

    public static void main(String[] args) {
        Person person = new Person("Rubén", new Date(102, 0, 11));
        System.out.println(person.getName() + " tiene " + person.getAge());
    }
    
}
