package state.task.modes;

import state.task.TravelMode;

public class Transit extends TravelMode {

    @Override
    protected Object calculateETA() {
        System.out.println("Calculating ETA (transit)");
        return 3;
    }

    @Override
    protected Object calculateDirection() {
        System.out.println("Calculating Direction (transit)");
        return 30;
    }
}
