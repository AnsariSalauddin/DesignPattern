package SingletonPattern;

import java.lang.reflect.Constructor;

public class UseSingleton {

    public static void main(String[] args) throws CloneNotSupportedException {
        MySingletonPattern singletonPattern1 = MySingletonPattern.getSingletonPattern();
        System.out.println(singletonPattern1.hashCode());
//        System.out.println(singletonPattern1.clone());
        System.out.println(SingletonUsingEnum.INSTANCE.hashCode());
//        try {
//            Class<MySingletonPattern> singletonPattern2 = MySingletonPattern.class;
//            Constructor<MySingletonPattern> declaredConstructor = singletonPattern2.getDeclaredConstructor();
//            declaredConstructor.setAccessible(true);
//            MySingletonPattern singletonPattern = declaredConstructor.newInstance();
//            System.out.println(singletonPattern.hashCode());
//        } catch (Exception e) {
//            e.printStackTrace();
//        }

    }

}
