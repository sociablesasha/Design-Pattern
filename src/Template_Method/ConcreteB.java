package Template_Method;

public class ConcreteB extends Abstract {

    private String data;

    public ConcreteB(String data) {
        this.data = data;
    }

    @Override
    public void DoOpen() {
        System.out.println("Hello, It's me. String!!!");
    }

    @Override
    public void DoDisplay() {
        System.out.println(data);
    }

    @Override
    public void DoClose() {
        System.out.println("Okay... Bye! String!!!");
    }

}
