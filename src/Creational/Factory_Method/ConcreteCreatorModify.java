package Creational.Factory_Method;

public class ConcreteCreatorModify implements Creator {

    @Override
    public Product factoryMethod(String name) {
        try {
            Class<?> cls = Class.forName(name);
            Object obj = cls.newInstance();
            return (Product) obj;
        } catch (Exception exception) {
            return null;
        }
    }
}
