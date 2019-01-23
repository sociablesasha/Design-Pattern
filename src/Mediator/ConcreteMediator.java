package Mediator;

public class ConcreteMediator implements Mediator {

    ColleagueA colleagueA;
    ColleagueB colleagueB;
    ColleagueC colleagueC;

    @Override
    public void fight() {
        System.out.println("Mediator is fighting!");
    }

    @Override
    public void talk() {
        System.out.println("Mediator is talking!");
    }

    @Override
    public void game() {
        System.out.println("Mediator is gaming!");
    }

    @Override
    public void registerA(ColleagueA a) {
        colleagueA = a;
    }

    @Override
    public void registerB(ColleagueB b) {
        colleagueB = b;
    }

    @Override
    public void registerC(ColleagueC c) {
        colleagueC = c;
    }

}
