package Creational.Singleton;

public class Client {

    public static void main(String[] args) {
        NotUse notUse_1 = NotUse.getInstance();
        NotUse notUse_2 = NotUse.getInstance();
        Use use_1 = new Use();
        Use use_2 = new Use();

        System.out.println(notUse_1.hashCode());
        System.out.println(notUse_2.hashCode());
        System.out.println(use_1.hashCode());
        System.out.println(use_2.hashCode());
    }

}
