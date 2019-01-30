package Creational.Prototype;

public class Client {

    public static void main(String[] args) {
        Prototype prototypeA = ConcretePrototypeA::new;
        Prototype prototypeB = ConcretePrototypeB::new;

        prototypeA.clone();
        prototypeB.clone();
    }

}
