package Behavioral.Interpreter;

public class TerminalExpression implements Expression {

    private String data;

    public TerminalExpression(String data) {
        this.data = data;
    }

    @Override
    public boolean interpret(Context context) {
//        return context.getContext().equals(data);
        return context.getContext().contains(data);
    }

}
