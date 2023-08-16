package ooss;

import java.util.Objects;

public class Klass {

    private final int number;

    public int getNumber() {
        return this.number;
    }

    public Klass(int number) {
        this.number = number;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Klass klass = (Klass) o;
        return number == klass.number;
    }

    @Override
    public int hashCode() {
        return Objects.hash(number);
    }

    public void assignLeader(Student student) {
        studentLeaderId = student.getId();
        System.out.println("It is not one of us.");
    }
    public boolean isLeader(Student student) {

        return student.getId() == studentLeaderId;
    }
}
