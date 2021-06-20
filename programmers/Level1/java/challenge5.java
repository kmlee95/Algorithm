package java;

import java.util.ArrayList;
import java.util.List;

//같은 숫자는 싫어
public class challenge5 {
    public static int[] solution(int[] arr) {
        List<Integer> list = new ArrayList<>();
        int[] answer = {};
        int test = 10; // 0보다 크고 9보다 작은 정수이므로 최댓값 기록.
        for (int values : arr) {
            if (test != values)
                list.add(values);
            test = values;
        }
        answer = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            answer[i] = list.get(i).intValue();
        }

        return answer;
    }

    public static void main(String[] args) {
        int arr1[] = { 1, 1, 3, 3, 0, 1, 1 };
        int result[] = solution(arr1);
        for (int data : result) {
            System.out.print(" " + data);
        }
    }
}
