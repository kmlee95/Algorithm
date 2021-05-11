
import java.util.*;

class problem2 {
  static class Printer {
    int location;
    int prior;

    Printer(int location, int prior) {
      this.location = location;
      this.prior = prior;
    }
  }

  static int solution(int[] priorities, int location) {
    int answer = 0;
    Queue<Printer> q = new LinkedList<>();

    for (int i = 0; i < priorities.length; i++) {
      q.offer(new Printer(i, priorities[i]));
    }

    while (!q.isEmpty()) {
      boolean flag = false;
      int com = q.peek().prior;
      for (Printer p : q) {
        if (com < p.prior) {
          flag = true;
        }
      }

      if (flag) {
        q.offer(q.poll());
        System.out.println(q.size());
      } else {
        if (q.poll().location == location) {

          answer = priorities.length - q.size();
        }
      }
    }

    return answer;
  }

  public static void main(String[] args) {
    int s = solution(new int[] { 1, 1, 9, 1, 1, 1 }, 0);
    System.out.println(s);
  }
}