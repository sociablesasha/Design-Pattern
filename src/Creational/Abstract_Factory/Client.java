package Creational.Abstract_Factory;

public class Client {

    public static void main(String[] args) {
        AbstractFactory factory = AbstractFactory.getInstance(Architecture.B);
        AbstractProduct product = factory.createProduct();
        System.out.println(product.getClass().getName());
    }

}
