package Behavioral.Visitor;

public class ConcreteElement implements Element {

    private String name;
    private Integer age;

    public ConcreteElement(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public Integer getAge() {
        return age;
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}
