package state.task.modes;

import state.task.TravelMode;

public class Walking extends TravelMode {

    @Override
    protected Object calculateETA() {
        System.out.println("Calculating ETA (walking)");
        return 4;
    }

    @Override
    protected Object calculateDirection() {
        System.out.println("Calculating Direction (walking)");
        return 40;
    }
}
