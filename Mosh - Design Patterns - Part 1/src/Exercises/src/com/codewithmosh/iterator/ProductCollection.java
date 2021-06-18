package Exercises.src.com.codewithmosh.iterator;

import java.util.ArrayList;
import java.util.List;

public class ProductCollection {

  private List<Product> products = new ArrayList<>();
  private int count = 0;

  public void add(Product product) {
    products.add(product);
    count++;
  }

  public Product remove() {
    count--;
    return products.remove(count);
  }

  public Iterator<Product> createIterator () {
    return new ListIterator(this);
  }

  private class ListIterator implements Iterator<Product> {
    private ProductCollection productCollection;
    int index = 0;

    public ListIterator(ProductCollection productCollection) {
      this.productCollection = productCollection;
    }

    @Override
    public boolean hasNext () {
      return index < productCollection.count;
    }

    @Override
    public void next () {
      index++;
    }

    @Override
    public Product current () {
      return products.get(index);
    }
  }
}
