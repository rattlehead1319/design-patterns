public class FactoryProducer {

    public AbstractShapeFactory getFactory(boolean rounded) {
        if (rounded) {
            return new RoundedShapeFactory();
        }
        return new ShapeFactory();
    }
}
