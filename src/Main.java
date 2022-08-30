import java.util.*;

class Main {
    public static void main(String[] args) {

        List<Person> people2 = Arrays.asList(
                new Person("Николай", "Валуеваев", 52),
                new Person("Виктор", "Цой", 32),
                new Person("Наталья", "Васильева-Бернард-Шоу", 40),
                new Person("Брюс", "Миклухо-Маклай-Маклаевич", 30),
                new Person("Константин", "Салтыков-Щедрин", 51)
        );
        Comparator<Person> comparator;
        comparator = Main::compare;
        Collections.sort(people2, comparator);
        System.out.println(people2.toString());
    }

    private static int compare(Person o1, Person o2) {
        String[] surnameSplitO1 = o1.surname.split("-");
        String[] surnameSplitO2 = o2.surname.split("-");
        if (surnameSplitO1.length != surnameSplitO2.length) {
            return surnameSplitO2.length - surnameSplitO1.length;
        } else if (surnameSplitO1.length > 2) {
            return o2.age - o1.age;
        } else {
            return o2.age - o1.age;
        }
    }
}