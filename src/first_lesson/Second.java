package first_lesson;

import first_lesson.impl.CustomVector;

public class Second {

  public static void main(String[] args) {
    CustomVector<Integer> vector = new CustomVector<>();
    vector.push(10);
    vector.push(20);
    vector.size();
    vector.pop();
    vector.size();
    vector.push(22);
    vector.back();
    vector.size();
    vector.clear();
    vector.size();
  }
}
