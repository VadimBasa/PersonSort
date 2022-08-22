public class Person implements Comparable<Person> {
    protected String name;
    protected String surname;
    protected int age;

    // создайте конструктор на все поля
    public Person(String name, String surname, int age) {
        this.name = name;
        this.surname = surname;
        this.age = age;
    }

    // создайте геттеры и сеттеры
    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public int age() {
        return age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setAge(int age) {
        this.age = age;
    }

    // создайте toString
    @Override
    public String toString() {
        return "name " + name + " surname " + surname + " age " + age;
    }

    @Override
    public int compareTo(Person p) {
        return surname.compareTo(p.getSurname());
    }
}