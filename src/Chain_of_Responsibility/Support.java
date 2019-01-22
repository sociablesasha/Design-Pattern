package Chain_of_Responsibility;

public abstract class Support {

    private String name;

    private Support next;

    public Support(String name) {
        this.name = name;
    }

    // Method Chain
    public Support setNext(Support next) {
        this.next = next;
        return next;
    }

    // Solve
    public final void support(Trouble trouble) {
        if (resolve(trouble)) {
            success(trouble);
        } else if (next != null) {
            next.support(trouble);
        } else {
            fail(trouble);
        }
    }

    // Resolve
    protected abstract boolean resolve(Trouble trouble);

    // Success (if Resolve)
    protected void success(Trouble trouble) { System.out.println(trouble + " is resolved by " + this.name + "."); }

    // Fail (if Non-Success & Non-Next)
    protected void fail(Trouble trouble) {
        System.out.println(trouble + " cannot be resolved.");
    }

}
