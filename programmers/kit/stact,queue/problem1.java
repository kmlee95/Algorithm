import java.util.*;

class problem1 {
  static int[] solution(int[] progresses, int[] speeds) {
    int[] answer = {};
    Queue<Integer> queue = new LinkedList<>();
    ArrayList<Integer> list = new ArrayList<>();

    int resultCount = 1;
    ;
    int count;

    for (int i = 0; i < speeds.length; i++) {
      count = 0;
      while (true) {
        progresses[i] += speeds[i];
        count++;
        if (progresses[i] >= 100) {
          queue.add(count);
          break;
        }
      }
    }

    int prev = queue.poll();
    while (!queue.isEmpty()) {
      int cruf = queue.poll();

      if (prev >= cruf) {
        resultCount++;
      } else {
        list.add(resultCount);
        resultCount = 1;
        prev = cruf;
      }
    }
    list.add(resultCount);

    answer = new int[list.size()];
    for (int i = 0; i < answer.length; i++) {
      answer[i] = list.get(i);
    }

    return answer;
  }

  public static void main(String[] args) {
    int[] s = solution(new int[] { 93, 30, 55 }, new int[] { 2, 1 });
    System.out.println(s);
  }
}