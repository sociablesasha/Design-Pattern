package Creational.Prototype;

public class ConcretePrototypeB implements Prototype {
    @Override
    public Prototype clone() {
        return this;
    }
}
