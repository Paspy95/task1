import java.util.ArrayList;
import java.util.List;

public class Data {
    private static List<Person> persons = new ArrayList<>();

    static {
        Person person1 = new Person("Кирилл", 26,"Middle java dev", 150000, "руб");
        Person person2 = new Person("Виталий", 28,"Senior java automation QA", 150000, "$");
        Person person3 = new Person("Александр", 31,"junior functional tester", 150000, "руб");
        Person person4 = new Person("Дементий", 35,"dev-ops", 150000, "$");

        persons.add(person1);
        persons.add(person2);
        persons.add(person3);
        persons.add(person4);
    }

    public static List<Person> getPersons() {
        return persons;
    }

    public static void setPersons(List<Person> persons) {
        Data.persons = persons;
    }
}
