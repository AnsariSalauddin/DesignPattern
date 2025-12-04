package DeepAndShallow;

public class DemoDeepCopy {
    public static void main(String[] args) {
        DeepCopy shallowCopy=new DeepCopy("Deep",new Student("99999"));

        try {
            DeepCopy clone = (DeepCopy) shallowCopy.clone();
            clone.name="deep1";
            clone.student.studentRollNo="90909";
            shallowCopy.student.studentRollNo="00101010";
            System.out.println(shallowCopy.name+" "+shallowCopy.student.studentRollNo);
            System.out.println(clone.name+" "+clone.student.studentRollNo);
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
    }
}
