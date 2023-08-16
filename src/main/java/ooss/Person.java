package ooss;

import java.util.Objects;

public class Person {

    private final int id;
    private final String name;
    private final int age;

    public Person(int id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return id == person.id && age == person.age;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, age);
    }

    public String introduce(){
        return String.format("My name is %s. I am %s years old.", name, age);
    }
}
