import java.util.*;

public class solution1 {
    public static void main(String[] args) {
        int N = 5, M = 8, K = 3;
        int j = 1; // 제일 큰 수를 사용한 횟수
        int answer = 0;
        int[] problem = { 2, 4, 5, 4, 6 };

        // Arrays.sort(problem, (a, b) -> b - a); //int를 Integer타입으로 바꿔야
        // reverseOrder이나 compare사용가능

        int[] arr = Arrays.stream(problem).boxed().sorted(Collections.reverseOrder()).mapToInt(Integer::intValue)
                .toArray();

        for (int i = 1; i <= 8; i++) {
            if (j == K) {
                answer += arr[1];
                j = 0;
                continue;
            }
            answer += arr[0];
            j++;
        }
        System.out.println(answer);
    }
}