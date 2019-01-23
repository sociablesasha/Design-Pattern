package Memento;

public class Originator {

    public String state;

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public Memento save() {
        return new Memento(state);
    }

    public void undo(Memento memento) {
        state = memento.getState();
    }


}
