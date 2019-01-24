package Behavioral.Visitor;

public interface Visitor {

    void visit(Element element);

    void visit(ConcreteElement  concreteElement);

}
