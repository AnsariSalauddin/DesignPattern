package DeepAndShallow;

public class DeepCopy implements Cloneable {
    String name;
    Student student;

    public DeepCopy(String name, Student student) {
        this.name = name;
        this.student = student;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return new DeepCopy(this.name,new Student(student.studentRollNo));
    }
}
