//위장

import java.util.*;

class problem1 {
  public int solution(String[][] clothes) {
    int answer = 1;

    Map<String, Integer> clothesMap = new HashMap<>(); // 종류 : 갯수

    for (int i = 0; i < clothes.length; i++) {
      clothesMap.put(clothes[i][1], clothesMap.getOrDefault(clothes[i][1], 0) + 1);
    }

    for (int val : clothesMap.values()) {
      answer *= (val + 1);
    }

    return answer - 1;
  }
}