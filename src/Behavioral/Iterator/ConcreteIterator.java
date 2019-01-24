package Behavioral.Iterator;

public class ConcreteIterator implements Iterator {

    private ConcreteAggregate concreteAggregate;
    private int index;

    public ConcreteIterator(ConcreteAggregate concreteAggregate) {
        this.concreteAggregate = concreteAggregate;
        this.index = 0;
    }

    @Override
    public boolean hasNext() {
        return index < concreteAggregate.getLength();
    }

    @Override
    public Object next() {
        String data = concreteAggregate.get(index);
        index++;
        return data;
    }

}
