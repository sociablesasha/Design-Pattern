package Behavioral.Observer;

import java.util.ArrayList;
import java.util.List;

public class ConcreteSubject implements Subject {

    private List<Observer> observerList;
    private String title;
    private String content;

    public ConcreteSubject() {
        observerList = new ArrayList<>();
    }

    public void add(Observer observer) {
        observerList.add(observer);
    }

    public void delete(Observer observer) {
        observerList.remove(observer);
    }

    public void notifyObserver() {
        for (Observer observer : observerList) {
            observer.update(title, content);
        }
    }

    public void setNews(String title, String content) {
        this.title = title;
        this.content = content;
        notifyObserver();
    }

    public String getTitle() {
        return title;
    }

    public String getContent() {
        return content;
    }

}
