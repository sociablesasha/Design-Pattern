package Observer;

public interface Subject {

    void add(Observer observer);
    void delete(Observer observer);
    void notifyObserver();

}
