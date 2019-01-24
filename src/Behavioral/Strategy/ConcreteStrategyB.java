package Behavioral.Strategy;

public class ConcreteStrategyB implements Strategy {

    @Override
    public void AlgorithmInterface() {
        System.out.println(this.getClass().getName());
    }

}
