package kata1v2;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class Kata1v2 {

    public static void main(String[] args) {
        Calendar date;
        date = GregorianCalendar.getInstance();
        date.set(1996,6,4);
        
        Person miPerson = new Person("Cristian David Estupiñán Ojeda",date);
        System.out.println(miPerson.getName() + " tiene " + miPerson.getAge() + " años.");
    }
}
