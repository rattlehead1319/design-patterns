public class AbstractFactoryDemo {

    public static void main (String[] args) {
        FactoryProducer fp = new FactoryProducer();
        AbstractShapeFactory asf = fp.getFactory(false);

        Shape s1 = asf.getShape("Rectangle");
        s1.draw();

        Shape s2 = asf.getShape("Square");
        s2.draw();

        asf = fp.getFactory(true);

        Shape s3 = asf.getShape("Rectangle");
        s3.draw();

        Shape s4 = asf.getShape("Square");
        s4.draw();
    }
}
