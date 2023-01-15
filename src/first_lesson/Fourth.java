package first_lesson;

import first_lesson.impl.QueueFromTwoStack;

public class Fourth {

  public static void main(String[] args) {
    QueueFromTwoStack<Integer> queue = new QueueFromTwoStack<>();
    queue.push(10);
    queue.push(20);
    queue.push(30);
    queue.size();
    queue.pop();
    queue.size();
    queue.push(22);
    queue.peek();
    queue.size();
    queue.clear();
    queue.pop();
    queue.peek();
    queue.size();
  }
}
