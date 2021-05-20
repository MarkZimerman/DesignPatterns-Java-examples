package state;

import state.task.DirectionService;
import state.task.modes.Bicycling;
import state.task.modes.Walking;

public class Main {
    public static void main(String[] args) {
        var service = new DirectionService(new Bicycling());

        System.out.println("ETA: " + service.getETA());
        System.out.println("Direction: " + service.getDirection());

        service.setTravelMode(new Walking());
        System.out.println("Changed to walking");
        System.out.println("ETA: " + service.getETA());
        System.out.println("Direction: " + service.getDirection());

    }
}
