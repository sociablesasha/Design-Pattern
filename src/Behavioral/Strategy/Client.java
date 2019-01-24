package Behavioral.Strategy;

public class Client {

    public static void main(String[] args) {
        Strategy contextA = new ConcreteStrategyA();
        Strategy contextB = new ConcreteStrategyB();
        Strategy contextC = new ConcreteStrategyC();

        Context context = new Context();

        context.setStrategy(contextA);
        context.ContextInterface();

        context.setStrategy(contextB);
        context.ContextInterface();

        context.setStrategy(contextC);
        context.ContextInterface();
    }

}
