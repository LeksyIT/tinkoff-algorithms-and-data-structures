package first_lesson;

import first_lesson.impl.SortingByChoice;
import java.util.ArrayList;
import java.util.List;

public class Fifth {

  public static void main(String[] args) {
    List<Integer> list = new ArrayList<>();
    list.add(5);
    list.add(4);
    list.add(5);
    list.add(3);
    list.add(3);
    list.add(2);
    list.add(5);
    list.add(1);
    list.add(2);
    list.add(5);
    list.add(4);
    list.add(4);
    list.add(5);
    list.add(4);
    list.add(3);
    SortingByChoice.sorted(list);
    System.out.println(list);
  }
}
