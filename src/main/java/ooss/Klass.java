package ooss;

import java.util.Objects;

public class Klass implements KlassIntroduction {

    private final int number;
    private int studentLeaderId;


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
        student.setLeader(true);
        System.out.println("It is not one of us.");
    }

    public boolean isLeader(Student student) {

        return student.getId() == studentLeaderId;
    }

    @Override
    public void attach(Teacher teacher) {
        System.out.printf("I am %s, teacher of Class %s. I know Tom become Leader.%n", teacher.getName(),
                teacher.getKlassNumbers().stream().findFirst().get());

    }

    @Override
    public void attach(Student student) {
        System.out.printf("I am %s, student of Class %s. I know Tom become Leader.%n", student.getName(),
                student.getKlassNumber());

    }

}
