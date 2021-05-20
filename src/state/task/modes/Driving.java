package state.task.modes;

import state.task.TravelMode;

public class Driving extends TravelMode {

    @Override
    protected Object calculateETA() {
        System.out.println("Calculating ETA (driving)");
        return 1;
    }

    @Override
    protected Object calculateDirection() {
        System.out.println("Calculating Direction (driving)");
        return 10;
    }
}
