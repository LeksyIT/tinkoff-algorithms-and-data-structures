package first_lesson.impl;

import java.util.List;

public class SortingByInserts {

  public static void sorted(List<Integer> list){
    for (int i = 1; i < list.size(); i++) {
      int j = i;
      while (j > 0 && list.get(j)<list.get(j-1)){
        int swap = list.get(j);
        list.set(j,list.get(j-1));
        list.set(j-1,swap);
        j--;
      }
    }
  }
}
