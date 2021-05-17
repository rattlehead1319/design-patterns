public class ShapeFactory extends AbstractShapeFactory {
    @Override
    Shape getShape(String stringType) {
        if (stringType.equals("Rectangle")) {
            return new Rectangle();
        }
        if (stringType.equals("Square")) {
            return new Square();
        }
        return null;
    }
}
