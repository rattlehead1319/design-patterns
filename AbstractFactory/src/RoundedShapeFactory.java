public class RoundedShapeFactory extends AbstractShapeFactory {

    @Override
    Shape getShape(String shapeType) {
        if (shapeType.equals("Rectangle")) {
            return new RoundedRectangle();
        }
        if (shapeType.equals("Square")) {
            return new RoundedSquare();
        }
        return null;
    }
}
