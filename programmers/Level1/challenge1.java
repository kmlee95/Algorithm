import java.util.ArrayList;
import java.util.Collections;

public class challenge1 {
    public static int[] solution(int[] numbers) {
        int[] answer = {};
        ArrayList<Integer> arr = new ArrayList<>();
        for (int i = 0; i < numbers.length - 1; i++) {
            for (int j = i + 1; j < numbers.length; j++) {
                if (!arr.contains(numbers[i] + numbers[j])) {
                    arr.add(numbers[i] + numbers[j]);
                }
            }
        }
        Collections.sort(arr);
        answer = new int[arr.size()];
        for (int i = 0; i < arr.size(); i++) {
            answer[i] = arr.get(i);
        }
        return answer;
    }

    public static void main(String[] args) {
        int[] number = { 1, 2, 3, 4, 5 };
        int[] result = solution(number);
        for (int obj : result) {
            System.out.print(" " + obj);
        }
    }
}