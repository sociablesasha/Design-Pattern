package Creational.Factory_Method;

public class Client {

    public static void main(String[] args) {
        Creator concrete = new ConcreteCreator();
        Creator concreteModify = new ConcreteCreatorModify();

        Product p_A = concrete.factoryMethod("A");
        Product p_B = concrete.factoryMethod("B");

        Product pm_A = concreteModify.factoryMethod("Creational.Factory_Method.ConcreteProductA");
        Product pm_B = concreteModify.factoryMethod("Creational.Factory_Method.ConcreteProductB");

        System.out.println(p_A);
        System.out.println(p_B);
        System.out.println(pm_A);
        System.out.println(pm_B);
    }

}
