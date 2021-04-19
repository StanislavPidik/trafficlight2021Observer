package trafficlight.observer;

import trafficlight.states.State;

public interface Observer {
    void update(State s);
}
