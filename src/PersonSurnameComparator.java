import java.util.*;

public class PersonSurnameComparator implements Comparator<Person> {
    private int surnameMax;

    public PersonSurnameComparator(int surnameMax) {
        this.surnameMax = surnameMax;
    }

    @Override
    public int compare(Person o1, Person o2) {
        String[] surnameSplitO1 = o1.surname.split("-");
        String[] surnameSplitO2 = o2.surname.split("-");
        if (surnameSplitO1.length != surnameSplitO2.length) {
            return surnameSplitO2.length - surnameSplitO1.length;
        } else if (surnameSplitO1.length > surnameMax) {
            return o2.age - o1.age;
        } else {
            return o2.age - o1.age;
        }
    }
}
