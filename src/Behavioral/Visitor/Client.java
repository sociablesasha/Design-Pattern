package Behavioral.Visitor;

public class Client {

    public static void main(String[] args) {
        Visitor visitor = new ConcreteVisitor();
        Element element_1 = new ConcreteElement("김용현", 20);
        Element element_2 = new ConcreteElement("이도현", 25);

        element_1.accept(visitor);
        element_2.accept(visitor);
    }

}
