
public class PrototypePatternDemo {

    public static void main (String[] main) {
        ShapeCache.loadCache();

        Shape clonedShape = (Shape) ShapeCache.getShape("1");
        System.out.println(clonedShape.type);

        clonedShape = (Shape) ShapeCache.getShape("2");
        System.out.println(clonedShape.type);
    }
}
