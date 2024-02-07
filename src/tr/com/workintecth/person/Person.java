package tr.com.workintecth.person;

public class Person {

    private String firstName;
    private String lastName;
    private int age;
    private String birthPlace;
    private String job;
    private boolean isMarried;

    public Person(String firstName, String lastName, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }

    public Person(String firstName, String lastName, int age, String birthPlace, String job, boolean isMarried) {
        this(firstName, lastName, age);
        this.birthPlace = birthPlace;
        this.job = job;
        this.isMarried = isMarried;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getAge() {
        return age;
    }

    public boolean isTeen(){
        int age = getAge();

        return age >= 13 && age <= 19;
    }
}
