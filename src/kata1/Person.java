package kata1;
import java.util.Calendar;
import java.util.GregorianCalendar;
/**
 *
 * @author agonz
 */
public class Person {
    private final String name;
    private final Calendar birthdate;
    private final long MILISECONDS_PER_YEAR = (long) (1000*60*60*24*365.25);
    
    public Person(String nombre, Calendar fecha) {
        name = nombre;
        birthdate = fecha;
    }

    public Calendar getBirthdate() {
        return birthdate;
    }

    public String getName() {
        return name;
    }
    
    public int getAge() {
        Calendar today = GregorianCalendar.getInstance();
        return (int)(millisecondsToYear(today.getTimeInMillis() - birthdate.getTimeInMillis()));
    }
    
    private long millisecondsToYear(long milles) {
        return milles / MILISECONDS_PER_YEAR;
    }
}
