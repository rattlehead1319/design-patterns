import java.util.*;

public class ShapeCache {

    private static Map<String, Shape> shapeMap = new HashMap<>();

    public static Shape getShape(String shapeId) {
        Shape sh = shapeMap.get(shapeId);
        return (Shape)sh.clone();
    }

    public static void loadCache () {
        Circle c = new Circle();
        c.setId("1");
        shapeMap.put(c.getId(), c);

        Rectangle r = new Rectangle();
        r.setId("2");
        shapeMap.put(r.getId(), r);
    }

}
