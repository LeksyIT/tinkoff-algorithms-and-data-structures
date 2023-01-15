package first_lesson.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;


public class CustomVector<T> {

  Logger logger = Logger.getLogger("logger");

  List<T> vector = new ArrayList<>();

  public void push(T element) {
    vector.add(element);
    logger.log(Level.INFO, "OK");
  }

  public void clear() {
    vector.clear();
    logger.log(Level.INFO, "OK");
  }

  public T pop() {
    if (vector.isEmpty()) {
      logger.log(Level.WARNING, "Error");
      return null;
    } else {
      T deletedElement = vector.remove(vector.size() - 1);
      logger.log(Level.INFO, "deletedElement: " + deletedElement);
      return deletedElement;
    }
  }

  public Integer size() {
    Integer size = vector.size();
    logger.log(Level.INFO, "size: " + size);
    return size;
  }

  public T back() {
    T last = vector.get(vector.size() - 1);
    logger.log(Level.INFO, "lastElement: " + last);
    return last;
  }
}

