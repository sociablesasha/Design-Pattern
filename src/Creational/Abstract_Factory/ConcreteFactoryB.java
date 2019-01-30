package Creational.Abstract_Factory;

public class ConcreteFactoryB extends AbstractFactory {
    @Override
    public AbstractProduct createProduct() {
        return new ConcreteProductB();
    }
}
