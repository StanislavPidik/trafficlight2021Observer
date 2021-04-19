package trafficlight.gui;


import trafficlight.observer.Observer;
import trafficlight.states.State;

import java.awt.*;

public class TrafficLight extends Light implements Observer {

    TrafficLight(Color color) {
        super(color);
    }

    public void turnOn(boolean a) {
        isOn = a;
        repaint();
    }

    public boolean isOn() {
        return isOn;
    }

    //TODO implement a part of the pattern here
    @Override
    public void update(State s) {

        turnOn(false);
        if (Color.green.equals(on) && s.getColor().equals("green")) {
            turnOn(true);
        } else if (Color.yellow.equals(on) && s.getColor().equals("yellow")) {
            turnOn(true);
        } else if (Color.red.equals(on) && s.getColor().equals("red")) {
            turnOn(true);
        }

    }
}
