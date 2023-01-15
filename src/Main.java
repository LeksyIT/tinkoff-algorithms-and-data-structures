import first_lesson.impl.CustomVector;
import java.util.List;

public class Main {

  public static void main(String[] args) {
    CustomVector<List<Integer>> vector = new CustomVector<>();
    vector.push(List.of(1, 2, 3));
    vector.push(List.of(1, 2, 3, 4));
    vector.pop();
    vector.size();
    vector.push(List.of(1, 2, 3, 4, 5));
    vector.size();
    vector.back();
    vector.size();
    vector.clear();
    vector.size();
    vector.pop();
  }
}