import java.util.Arrays;

//완주하지 못한 선수
public class challenge2 {
    public static String solution(String[] participant, String[] completion) {
        Arrays.sort(participant);
        Arrays.sort(completion);
        int i;
        for (i = 0; i < completion.length; i++) {
            if (!participant[i].equals(completion[i]))
                return participant[i];
        }
        return participant[i];
    }

    public static void main(String[] args) {
        String[] test1 = { "leo", "kiki", "eden" };
        String[] test2 = { "leo", "eden" };
        String result = solution(test1, test2);

        System.out.println(result);
    }
}
