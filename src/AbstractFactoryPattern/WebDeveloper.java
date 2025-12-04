package AbstractFactoryPattern.FactoryPattern;

public class WebDeveloper implements Employee {

    @Override
    public int salary() {
        System.out.println("Web Developer");
        return 200;
    }
}
