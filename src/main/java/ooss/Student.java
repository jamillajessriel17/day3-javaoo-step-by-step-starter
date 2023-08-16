package ooss;

import java.util.Objects;

public class Student extends Person {
    private int klassNumber;
    public Student(int id, String name, int age) {
        super(id, name, age);
    }

    public int getKlassNumber() {
        return klassNumber;
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
        String aStudent = " I am a student.";
        if (klassNumber == 0){
            return super.introduce().concat(aStudent);
        }
        return super.introduce().concat(aStudent).concat(String.format(" I am in class %s.",klassNumber));
    }

    public void join(Klass klass) {
         klassNumber = klass.getNumber();

    }

    public boolean isIn(Klass klass) {
   return klass.getNumber() == klassNumber;
    }
}
