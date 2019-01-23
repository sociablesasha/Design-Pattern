package mediator;

public class Client {

    public static void main(String[] args) {
        Mediator mediator = new ConcreteMediator();

        Colleague a = new ColleagueA(mediator);
        Colleague b = new ColleagueB(mediator);
        Colleague c = new ColleagueC(mediator);


        a.doSomething();
        b.doSomething();
        c.doSomething();
    }

}
