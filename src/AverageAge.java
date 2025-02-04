import java.util.List;
import java.util.OptionalDouble;
import java.util.stream.Collectors;

public class AverageAge {
    public static void main(String[] args) {
        List<Person> persons = Data.getPersons();
        OptionalDouble personsAverage = persons.stream()
                .mapToInt(Person::getAge).average();
        System.out.println(personsAverage);
        }
}