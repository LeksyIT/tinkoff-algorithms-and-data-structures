package first_lesson;

import java.util.ArrayList;
import java.util.List;

public class Shoplifting {

  //A. Кража в магазине
  public static void main(String[] args) {
    List<Integer> list = new ArrayList<>();
    list.add(10);
    list.add(13);
    list.add(12);
    list.add(8);
    list.add(15);
    System.out.println(findMInLift(list));
  }

  private static Integer findMInLift(List<Integer> list) {
    int min = list.get(0);
    int max = list.get(0);
    for (Integer el : list) {
      if (el > max) {
        max = el;
      }
      if (el < min) {
        min = el;
      }
    }
    return max - min + 1 - list.size();
  }
}
