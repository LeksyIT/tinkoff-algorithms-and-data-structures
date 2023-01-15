package first_lesson.impl;

import java.util.List;

public class BubbleSorting {
  public static void sorted(List<Integer> list) {
    for (int i = 0; i < list.size(); i++) {
      for (int j = 0; j < list.size() - 1; j++) {
        if (list.get(j) > list.get(j + 1)) {
          int swap = list.get(j);
          list.set(j, list.get(j + 1));
          list.set(j + 1, swap);
        }
      }
    }
  }
}
