package pattern_observer_classes;

import java.util.ArrayList;

import interfaces.IObserver;
import interfaces.ISubject;

public class Subject implements ISubject {

    private ArrayList<IObserver> observers;

    public Subject() {
        this.observers = new ArrayList<>();
    }

    public void registerObserver(IObserver observer) {
        this.observers.add(observer);
    }

    public void removeObserver(IObserver observer) {
        this.observers.remove(observer);
    }

    public void notifyObservers(String message) {
        for (IObserver observer : this.observers) {
            observer.update(message);
        }
    }

}