package Iterator;

public class ConcreteAggregate implements Aggregate {

    private String[] strings;
    private int size = 0;

    public ConcreteAggregate(int maxSize) {
        this.strings = new String[maxSize];
    }

    public String get(int index) {
        return strings[index];
    }

    public void append(String data) {
        this.strings[size] = data;
        size++;
    }

    public int getLength() {
        return size;
    }

    @Override
    public Iterator iterator() {
        return new ConcreteIterator(this);
    }

}
