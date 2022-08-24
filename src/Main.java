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
        Collections.sort(people2, new PersonSurnameComparator(2));
        System.out.println(people2.toString());

    }
}