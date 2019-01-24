package Behavioral.Template_Method;

public class Client {

    public static void main(String[] args) {
        Abstract concreteA = new ConcreteA('a');
        Abstract concreteB = new ConcreteB("ABCDEFG");

        concreteA.templateMethod();
        concreteB.templateMethod();
    }

}
