package Exercises.src.com.codewithmosh.state;

public class DirectionService {
    private ITravelMode travelMode;

    public Object getEta() {
        return travelMode.getEta();
    }

    public Object getDirection() {
        return travelMode.getDirection();
    }

    public ITravelMode getTravelMode() {
        return travelMode;
    }

    public void setTravelMode(ITravelMode travelMode) {
        this.travelMode = travelMode;
    }
}
