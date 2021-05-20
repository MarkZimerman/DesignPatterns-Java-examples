package state.task.modes;

import state.task.TravelMode;

public class Bicycling extends TravelMode {

    @Override
    protected Object calculateETA() {
        System.out.println("Calculating ETA (bicycling)");
        return 2;
    }

    @Override
    protected Object calculateDirection() {
        System.out.println("Calculating Direction (bicycling)");
        return 20;
    }
}
