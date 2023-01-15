package first_lesson.impl;

import java.util.List;

public class SortingByChoice {
  public static void sorted(List<Integer> list){
    for (int i = 0; i < list.size(); i++) {
      int min = i;
      for (int j = i+1; j < list.size(); j++) {
        if (list.get(j)<list.get(min)){
          min = j;
        }
      }
      int swap = list.get(i);
      list.set(i,list.get(min));
      list.set(min,swap);
    }
  }
}
