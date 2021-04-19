package trafficlight.subject;

import trafficlight.observer.Observer;
import trafficlight.states.State;

import java.util.ArrayList;
import java.util.List;

public abstract class Subject {

    private List<Observer> observers = new ArrayList<>();

    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    public void removeObserver(Observer observer) {
        observers.remove(observer);

    }

    public void notifyObservers(State state) {
        for (Observer observer : observers)
            observer.update(state);
    }

    public List<Observer> getObservers() {
        return observers;
    }
}
