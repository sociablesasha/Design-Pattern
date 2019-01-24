package Behavioral.Mediator;

public class ColleagueA extends Colleague {

    public ColleagueA(Mediator mediator) {
        this.mediator = mediator;
    }


    @Override
    void doSomething() {
        this.mediator.talk();
        this.mediator.registerA(this);
    }

}
