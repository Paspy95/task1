public class Person {
    private String firstName;
    private int age;
    private String post;
    private int salary;
    private String currency;


    public Person(String firstName, int age, String post, int salary, String currency) {
        this.firstName = firstName;
        this.age = age;
        this.post = post;
        this.salary = salary;
        this.currency = currency;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getPost() {
        return post;
    }

    public void setPost(String post) {
        this.post = post;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    @Override
    public String toString() {
        return firstName;
    }
}
