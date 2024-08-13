package validating;

public class Person {

    private String name;
    private int age;

    public Person(String name, int age) {
        if(name.equals(null) || name.equals("") || name.length()>40){
            throw new IllegalArgumentException("Name can not be null,empty or more than 40 characters long");
        }
        this.name = name;
        if(age < 0 || age > 120){
            throw new IllegalArgumentException("Age should be between 0-120 years");
        }
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}
