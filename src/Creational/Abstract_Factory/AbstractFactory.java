package Creational.Abstract_Factory;

public abstract class AbstractFactory {

    private static final ConcreteFactoryA CONCRETE_FACTORY_A = new ConcreteFactoryA();
    private static final ConcreteFactoryB CONCRETE_FACTORY_B = new ConcreteFactoryB();

    static AbstractFactory getInstance(Architecture architecture) {
        AbstractFactory factory = null;
        switch (architecture) {
            case A:
                factory = CONCRETE_FACTORY_A;
                break;
            case B:
                factory = CONCRETE_FACTORY_B;
                break;
        }
        return factory;
    }

    public abstract AbstractProduct createProduct();
}
