import java.util.List;
import java.util.stream.Collectors;

public class AgeSort {
    public static void main(String[] args) {
        List<Person> persons = Data.getPersons();
        List<Person> personsAge = persons.stream()
                .filter(person -> person.getAge()<30)
                .collect(Collectors.toList());
        for (int i = 0; i < personsAge.size(); i++) {
            System.out.println(personsAge.get(i));
        }
    }
}