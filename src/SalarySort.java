import java.util.List;
import java.util.stream.Collectors;

public class SalarySort {
    public static void main(String[] args) {
        List<Person> persons = Data.getPersons();
        List<Person> personsSalary = persons.stream()
                .filter(person -> person.getCurrency()=="руб")
                .collect(Collectors.toList());
        for (int i = 0; i < personsSalary.size(); i++) {
            System.out.println(personsSalary.get(i));
        }
    }
}