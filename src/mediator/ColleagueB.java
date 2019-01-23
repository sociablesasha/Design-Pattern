package mediator;

public class ColleagueB extends Colleague {

    public ColleagueB(Mediator mediator) {
        this.mediator = mediator;
    }

    @Override
    void doSomething() {
        this.mediator.fight();
        this.mediator.registerB(this);
    }
    
}
