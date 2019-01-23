package State;

public class Context {

    private State state;

    public Context() {
        state = new ConcreteStateA();
    }

    public void setState(State state) {
        this.state = state;
    }

    public void normal() {
        state.concreteStateA(this);
    }

    public void alram() {
        state.concreteStateB(this);
    }

}
