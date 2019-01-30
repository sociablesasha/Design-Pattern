package Creational.Prototype;

public class ConcretePrototypeA implements Prototype {
    @Override
    public Prototype clone() {
        return this;
    }
}
