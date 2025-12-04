package DeepAndShallow;

public class Demo {
    public static void main(String[] args) {

        ShallowCopy obj1 = new ShallowCopy("shallow", new Student("240328"));

        try {
            ShallowCopy obj2 = (ShallowCopy) obj1.clone();

            System.out.println("Before change:");
            System.out.println(obj1.name + " " + obj1.student.studentRollNo);
            System.out.println(obj2.name + " " + obj2.student.studentRollNo);

            // These changes happen AFTER cloning – this is what you missed
            obj1.name = "shallow1";
            obj1.student.setStudentRollNo("0000000");

            System.out.println("\nAfter change:");
            System.out.println(obj1.name + " " + obj1.student.studentRollNo);
            System.out.println(obj2.name + " " + obj2.student.studentRollNo);

        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
    }
}
