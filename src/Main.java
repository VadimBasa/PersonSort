import java.util.*;

class Main {
    public static void main(String[] args) {

        List<Person> people2 = Arrays.asList(
                new Person("Николай", "Валуеваев", 52),
                new Person("Виктор", "Цой", 32),
                new Person("Михаил", "Круглогодич", 40),
                new Person("Брюс", "Лиy", 30),
                new Person("Константин", "Дзю", 51)
        );
        Collections.sort(people2, new PersonSurnameComparator(6));
        System.out.println(people2.toString());

    }
}