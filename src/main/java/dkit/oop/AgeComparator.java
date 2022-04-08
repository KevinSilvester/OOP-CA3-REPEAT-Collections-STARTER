package dkit.oop;

import java.util.Comparator;

public class AgeComparator implements Comparator<Player> {
   @Override
   public int compare(Player o1, Player o2) {
      return o2.getAge() - o1.getAge();
   }
}
