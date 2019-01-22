package Interpreter;

public class Client {

    public static Expression getOrExpression(){
        Expression robert = new TerminalExpression("Robert");
        Expression john = new TerminalExpression("John");
        return new OrExpression(robert, john);
    }

    //Rule: Julie is a married women
    public static Expression getAndExpression(){
        Expression julie = new TerminalExpression("Julie");
        Expression married = new TerminalExpression("Married");
        return new AndExpression(julie, married);
    }

    public static void main(String[] args) {
        Expression orExpression = getOrExpression();
        Expression andExpression = getAndExpression();

        System.out.println("OR John [Robert John] " + orExpression.interpret(new Context("John")));
        System.out.println("AND Julie Married [Married Julie] " + andExpression.interpret(new Context("Married Julie")));
    }

}
