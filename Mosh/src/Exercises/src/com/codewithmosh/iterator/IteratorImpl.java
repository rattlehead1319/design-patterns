package Exercises.src.com.codewithmosh.iterator;

public class IteratorImpl {
    public static void main(String[] args) {
        ProductCollection productCollection = new ProductCollection();
        productCollection.add(new Product(1, "Orange"));
        productCollection.add(new Product(2, "Apple"));
        productCollection.add(new Product(3, "Guava"));

        Iterator<Product> it = productCollection.createIterator();
        while (it.hasNext()) {
            System.out.println(it.current().toString());
            it.next();
        }
    }
}
