package SingletonPattern;

public class MySingletonPattern {

    private static MySingletonPattern singletonPattern;
    private MySingletonPattern(){
        if (singletonPattern != null) {
            throw new RuntimeException("Don't cheat. Use getInstance().");
        }
    }
    protected Object readResolve() {
        return singletonPattern;
    }
    @Override
    protected Object clone() throws CloneNotSupportedException {
        throw new CloneNotSupportedException("No cloning allowed.");
    }

    public static MySingletonPattern getSingletonPattern(){
        if(singletonPattern==null){
            singletonPattern=new MySingletonPattern();
        }
        return singletonPattern;
    }

}
