package Creational.Factory_Method;

public class ConcreteCreator implements Creator {

    @Override
    public Product factoryMethod(String name) {
        switch (name) {
            case "A": return new ConcreteProductA();
            case "B": return new ConcreteProductB();
        }
        return null;
    }

}
