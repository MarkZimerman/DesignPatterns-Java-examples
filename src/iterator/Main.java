package iterator;

import iterator.task.Product;
import iterator.task.ProductCollection;

public class Main {
    public static void main(String[] args) {
        var collection = new ProductCollection();
        collection.add(new Product(1, "a"));
        collection.add(new Product(2, "b"));
        collection.add(new Product(3, "c"));

        var iterator = collection.createIterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
