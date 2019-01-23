package mediator;

public class ColleagueC extends Colleague {

    public ColleagueC(Mediator mediator) {
        this.mediator = mediator;
    }

    @Override
    void doSomething() {
        this.mediator.game();
        this.mediator.registerC(this);
    }
    
}
