package Exercises.src.com.codewithmosh.state;

public class StateImpl {
    public static void main(String[] args) {
        DirectionService directionService = new DirectionService();
        ITravelMode travelMode = new Walking();
        directionService.setTravelMode(travelMode);
        System.out.println(directionService.getEta());
        System.out.println(directionService.getDirection());
    }
}
