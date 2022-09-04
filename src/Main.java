import java.util.*;
import java.util.function.Predicate;

class Main {
    //@FunctionalInterface
    //public interface Predicate<Person> extends java.util.function.Predicate<Person> {
    //    boolean test (Person t);
    //}
    public static void main(String[] args) {
        List<Person> people2 = Arrays.asList(
                new Person("Николай", "Валуеваев", 17),
                new Person("Виктор", "Цой", 16),
                new Person("Наталья", "Васильева-Бернард-Шоу", 40),
                new Person("Брюс", "Миклухо-Маклай-Маклаевич", 30),
                new Person("Константин", "Салтыков-Щедрин", 51)
        );
        Comparator<Person> comparator;
        comparator = (o1, o2) -> {
            o2.compareTo(o1);
            String[] surnameSplitO1 = o1.surname.split("-");
            String[] surnameSplitO2 = o2.surname.split("-");
            if (surnameSplitO1.length != surnameSplitO2.length) {
                return surnameSplitO2.length - surnameSplitO1.length;
            } else if (surnameSplitO1.length > 2) {
                return o2.age - o1.age;
            } else {
                return o2.age - o1.age;
            }

        };
        Collections.sort(people2, comparator);
        //System.out.println(people2.toString());
        List<Person> peopleList = new ArrayList<>(List.of());
        peopleList.addAll(people2);
        Predicate<Person> isTooYang = (p) -> p.getAge() < 18;
        {
            peopleList.removeIf(isTooYang);
            System.out.println(peopleList.toString());
        }
    }

   /* private static int compare(Person o1, Person o2) {
        String[] surnameSplitO1 = o1.surname.split("-");
        String[] surnameSplitO2 = o2.surname.split("-");
        if (surnameSplitO1.length != surnameSplitO2.length) {
            return surnameSplitO2.length - surnameSplitO1.length;
        } else if (surnameSplitO1.length > 2) {
            return o2.age - o1.age;
        } else {
            return o2.age - o1.age;
        }
    }*/
}
