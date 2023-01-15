package first_lesson;

import java.util.Set;
import java.util.Stack;

public class Third {

  public static void main(String[] args) {
    System.out.println(checkForValid("()()()[]("));
    System.out.println(checkForValid("{()()()[]}"));
  }

  public static boolean checkForValid(String str) {

    Stack<Character> stack = new Stack<>();

    Set<Character> leftBracket = Set.of('(', '{', '[');

    for (int i = 0; i < str.length(); i++) {
      char element = str.charAt(i);
      if (leftBracket.contains(element)) {
        stack.push(element);
      } else {
        char lastElement = stack.peek();
        if (!stack.empty() && (element - lastElement == 1 || element - lastElement == 2)) {
          stack.pop();
        } else {
          return false;
        }
      }
    }
    return stack.isEmpty();
  }
}
