package DeepAndShallow;

public class ShallowCopy  implements Cloneable{
    public String name;
    Student student;

    public ShallowCopy(String name,Student student){
        this.name=name;

        this.student=student;
    }
    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
