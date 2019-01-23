package Strategy;

public class ConcreteStrategyC implements Strategy {

    @Override
    public void AlgorithmInterface() {
        System.out.println(this.getClass().getName());
    }

}
