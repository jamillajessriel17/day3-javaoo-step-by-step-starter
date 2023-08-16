package ooss;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

public class Teacher extends Person {

    private final List<Integer> klassNumbers = new ArrayList<>();

    public Teacher(int id, String name, int age) {
        super(id, name, age);
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person =(Person) o;
        return getId() == person.getId();
    }
    @Override
    public int hashCode() {
        return Objects.hash(getId());
    }
    @Override
    public String introduce() {
        return String.format("My name is %s. I am %s years old. I am a teacher.", getName(), getAge());
    }

    public void assignTo(Klass klass) {
        klassNumbers.add(klass.getNumber());
    }

    public boolean belongsTo(Klass klass) {
       return klassNumbers.contains(klass.getNumber());
    }
}
