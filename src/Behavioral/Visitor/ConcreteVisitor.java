package Behavioral.Visitor;

public class ConcreteVisitor implements Visitor {

    @Override
    public void visit(Element element) {
        System.out.println("Override");
    }

    @Override
    public void visit(ConcreteElement element) {
        System.out.println(element.getAge() + " | " + element.getName());
    }

}
