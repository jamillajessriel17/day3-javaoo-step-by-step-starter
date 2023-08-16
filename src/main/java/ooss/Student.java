package ooss;

public class Student extends Person {

    public Student(int id, String name, int age) {
        super(id, name, age);
    }

    @Override
    public String introduce() {
        return String.format("My name is %s. I am %s years old. I am a student.", getName(), getAge());
    }
}
