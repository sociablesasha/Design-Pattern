package Memento;

public class Client {

    public static void main(String[] args) {
        Originator originator = new Originator();
        Caretaker caretaker = new Caretaker();

        originator.setState("ONE");
        originator.setState("TWO");
        caretaker.add(originator.save());

        originator.setState("THREE");
        caretaker.add(originator.save());

        originator.setState("FOUR");

        System.out.println("Current Originator  " + originator.getState());
        System.out.println("First CareTaker  " + caretaker.get(0).getState());
        System.out.println("Second CareTaker  " + caretaker.get(1).getState());
    }

}
