package dkit.oop;

import java.util.Comparator;

public class ProductNameComparator implements Comparator<Product> {
   @Override
   public int compare(Product p1, Product p2) {
      return p1.getLastName().compareTo(p2.getLastName());
   }
}
