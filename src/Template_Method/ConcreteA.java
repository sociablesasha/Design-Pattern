package Template_Method;

public class ConcreteA extends Abstract {

    private char data;

    public ConcreteA(char data) {
        this.data = data;
    }

    @Override
    public void DoOpen() {
        System.out.println("Hello, It's me.");
    }

    @Override
    public void DoDisplay() {
        System.out.println(data);
    }

    @Override
    public void DoClose() {
        System.out.println("Okay... Bye!");
    }

}
