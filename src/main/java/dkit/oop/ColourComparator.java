package dkit.oop;

import java.util.Comparator;

public class ColourComparator implements Comparator<Product> {
   @Override
   public int compare(Product o1, Product o2) {
      return o1.getColour().compareTo(o2.getColour());
   }
}
