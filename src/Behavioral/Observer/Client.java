package Behavioral.Observer;

public class Client {

    public static void main(String[] args) {

        Subject subject = new ConcreteSubject();

        Observer observerA = new ConcreteObserverA();
        Observer observerB = new ConcreteObserverB();

        subject.add(observerA);
        subject.add(observerB);

        ((ConcreteSubject) subject).setNews("강남역 2호선", "2호선 중 강남역은 사람이 너무 많다.");
        ((ConcreteSubject) subject).setNews("대전 관저동", "이번 주 금요일, 김용현이 간다.");

    }

}
