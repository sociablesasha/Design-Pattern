package Behavioral.State;

public class ConcreteStateA implements State {

    @Override
    public void concreteStateA(Context context) {

    }

    @Override
    public void concreteStateB(Context context) {
        context.setState(new ConcreteStateB());
    }

}
