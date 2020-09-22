import java.util.ArrayList;
import java.util.List;

//완전탐색 -> 모의고사

public class challenge4 {
    public static int[] solution(int[] answers) {
        int[] result = { 0, 0, 0 };
        int[] answer = {};
        int max = 0;
        int[] person1 = { 1, 2, 3, 4, 5 };
        int[] person2 = { 2, 1, 2, 3, 2, 4, 2, 1 };
        int[] person3 = { 3, 3, 1, 1, 2, 2, 4, 4, 5, 5 };

        for (int i = 0; i < answers.length; i++) {
            if (answers[i] == person1[i % 5])
                result[0]++;
            if (answers[i] == person2[i % 8])
                result[1]++;
            if (answers[i] == person3[i % 10])
                result[2]++;
        }
        for (int k = 0; k < 3; k++) {
            if (max < result[k])
                max = result[k];
        }

        List<Integer> list = new ArrayList<>();
        if (max == result[0])
            list.add(1);
        if (max == result[1])
            list.add(2);
        if (max == result[2])
            list.add(3);

        answer = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            answer[i] = (int) list.get(i);
        }

        return answer;
    }

    public static void main(String[] args) {
        int[] answer = { 1, 2, 3, 4, 5 };
        System.out.println(solution(answer));
    }
}
