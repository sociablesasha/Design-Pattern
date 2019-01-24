package Behavioral.Template_Method;

public abstract class Abstract {

    public abstract void DoOpen();

    public abstract void DoDisplay();

    public abstract void DoClose();

    public void templateMethod() {
        DoOpen();

        for (int i = 0; i < 5; i++)
            DoDisplay();

        DoClose();
    }

}
