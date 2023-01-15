package first_lesson.impl;

import java.util.Stack;
import java.util.logging.Level;
import java.util.logging.Logger;

public class QueueFromTwoStack<T> {

  Stack<T> stack = new Stack<>();
  Stack<T> reverseStack = new Stack<>();

  Logger logger = Logger.getLogger("logger");

  public void push(T element) {
    stack.add(element);
    logger.log(Level.INFO, "OK");
  }

  public void clear() {
    stack.clear();
    reverseStack.clear();
    logger.log(Level.INFO, "OK");
  }

  public T pop() {
    if (checkForEmpty()) {
      return null;
    }
    if (reverseStack.isEmpty()) {
      while (!stack.isEmpty()) {
        reverseStack.add(stack.pop());
      }
    }
    T deletedElement = reverseStack.pop();
    logger.log(Level.INFO, "deletedElement: " + deletedElement);
    return deletedElement;
  }

  public Integer size() {
    Integer size = stack.size() + reverseStack.size();
    logger.log(Level.INFO, "size: " + size);
    return size;
  }

  public T peek() {
    if (checkForEmpty()) {
      return null;
    }
    if (reverseStack.isEmpty()) {
      while (!stack.isEmpty()) {
        reverseStack.add(stack.pop());
      }
    }
    T lastElement = reverseStack.peek();
    logger.log(Level.INFO, "lastElement: " + lastElement);
    return lastElement;
  }

  private boolean checkForEmpty() {
    boolean result = stack.isEmpty() && reverseStack.isEmpty();
    if (result) {
      logger.log(Level.WARNING, "Empty Queue");

    }
    return result;
  }
}
