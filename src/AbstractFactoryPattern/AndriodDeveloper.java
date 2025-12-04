package AbstractFactoryPattern.FactoryPattern;

public class AndriodDeveloper  implements Employee {
    @Override
    public int salary() {
        System.out.println("Android Developer");
        return 100;
    }
}
