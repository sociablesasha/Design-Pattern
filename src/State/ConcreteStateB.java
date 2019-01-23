package State;

public class ConcreteStateB implements State {

    @Override
    public void concreteStateA(Context context) {
        context.setState(new ConcreteStateA());
    }

    @Override
    public void concreteStateB(Context context) {

    }

}
