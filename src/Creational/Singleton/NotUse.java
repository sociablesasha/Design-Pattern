package Creational.Singleton;

public class NotUse {

    private static NotUse notUse = new NotUse();

    private NotUse() {
    }

    public static NotUse getInstance() {
        return notUse;
    }

}
