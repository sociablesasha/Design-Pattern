package Behavioral.Strategy;

public class ConcreteStrategyA implements Strategy {

    @Override
    public void AlgorithmInterface() {
        System.out.println(this.getClass().getName());
    }

}
