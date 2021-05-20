package state.task;

public class DirectionService {
    public TravelMode getTravelMode() {
        return travelMode;
    }

    public DirectionService(TravelMode travelMode) {
        this.travelMode = travelMode;
    }

    public Object getETA() {
        return travelMode.calculateETA();
    }

    public Object getDirection() {
        return travelMode.calculateDirection();
    }

    public void setTravelMode(TravelMode travelMode) {
        this.travelMode = travelMode;
    }

    private TravelMode travelMode;
}
