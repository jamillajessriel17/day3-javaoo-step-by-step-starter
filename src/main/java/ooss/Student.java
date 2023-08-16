package ooss;

import java.util.Objects;

public class Student extends Person {
    private int klassNumber = 0;
    public Student(int id, String name, int age) {
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
        if (klassNumber == 0){
            return String.format("My name is %s. I am %s years old. I am a student.", getName(), getAge());
        }
        return String.format("My name is %s. I am %s years old. I am a student. I am in class %s.", getName(), getAge(), klassNumber);
    }

    public void join(Klass klass) {
         klassNumber = klass.getNumber();
    }

    public boolean isIn(Klass klass) {
   return klass.getNumber() == klassNumber;
    }
}
