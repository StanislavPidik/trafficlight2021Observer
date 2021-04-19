package trafficlight.ctrl;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import trafficlight.states.State;

import static org.junit.jupiter.api.Assertions.*;

class TrafficLightCtrlTest {

    @BeforeAll
    static void init() {}

    @BeforeEach
    void setUp() {}

    @Test
    @DisplayName("test Singleton")
    void getInstance() {
        TrafficLightCtrl ctrl1 = TrafficLightCtrl.getInstance();
        TrafficLightCtrl ctrl2 = TrafficLightCtrl.getInstance();
        assertSame(ctrl1, ctrl2);
    }

    @Test
    @DisplayName("test next state after green")
    void nextStateGreen() {
        TrafficLightCtrl ctrl = TrafficLightCtrl.getInstance();
        State green = ctrl.getGreenState();
        State yellow = ctrl.getYellowState();
        assertSame(green.getNextState(), yellow);
    }

    @Test
    @DisplayName("test next state after red")
    void nextStateRed() {
        TrafficLightCtrl ctrl = TrafficLightCtrl.getInstance();
        State red = ctrl.getRedState();
        State yellow = ctrl.getYellowState();
        assertSame(red.getNextState(), yellow);
    }
}