package iterator.task;

import java.util.ArrayList;
import java.util.List;

public class ProductCollection {
  private List<Product> products = new ArrayList<>();

  public void add(Product product) {
    products.add(product);
  }

  public Iterator createIterator() {
    return new ProductIterator(this);
  }

  class ProductIterator implements Iterator {
    private ProductCollection collection;
    private int index = 0;

    public ProductIterator(ProductCollection collection) {
      this.collection = collection;
    }

    @Override
    public boolean hasNext() {
      return index < collection.products.size();
    }

    @Override
    public Object next() {
      return collection.products.get(index++);
    }
  }

}
