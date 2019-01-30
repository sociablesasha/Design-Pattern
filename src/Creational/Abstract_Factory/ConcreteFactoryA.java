package Creational.Abstract_Factory;

public class ConcreteFactoryA extends AbstractFactory {

    @Override
    public AbstractProduct createProduct() {
        return new ConcreteProductA();
    }
}
