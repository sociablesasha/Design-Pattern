package Behavioral.Iterator;

public class Client {

    public static void main(String[] args) {
        ConcreteAggregate concreteAggregate = new ConcreteAggregate(4);
        Iterator concreteIterator = concreteAggregate.iterator();

        concreteAggregate.append("Hello");
        concreteAggregate.append("ABC");
        concreteAggregate.append("Push");
        concreteAggregate.append("E.T");


        while (concreteIterator.hasNext()) {
            System.out.println(concreteIterator.next());
        }
    }

}
