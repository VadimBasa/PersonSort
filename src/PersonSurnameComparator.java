import java.util.*;

public class PersonSurnameComparator implements Comparator<Person> {
    private int surnameMax;

    public PersonSurnameComparator(int surnameMax) {
        this.surnameMax = surnameMax;
    }

    @Override
    public int compare(Person o1, Person o2) {

        if (o1.surname.length() != o2.surname.length()) {
            return o2.surname.length() - o1.surname.length();
        } else if (o1.surname.length() > surnameMax) {
            return o2.age - o1.age;
        } else {
            return o2.age - o1.age;
        }
    }
}

