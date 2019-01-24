package Behavioral.Observer;

public class ConcreteObserverA extends Display implements Observer {

    private String title;
    private String content;

    @Override
    public void update(String title, String content) {
        this.title = title;
        this.content = content;
        display();
    }

    @Override
    void display() {
        System.out.println("\n\n===============================");
        System.out.println();
        System.out.println(this.getClass().getName());
        System.out.println("제목: " + title);
        System.out.println("내용: " + content);
        System.out.println();
        System.out.println("===============================\n\n");
    }

}
