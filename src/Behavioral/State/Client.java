package Behavioral.State;

public class Client {

    public static void main(String[] args) {
        Context context = new Context();

        context.alram();
        context.normal();
        context.alram();
        context.normal();
    }

}
