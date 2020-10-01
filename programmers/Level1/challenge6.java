//수박수박수박수?
public class challenge6 {
    public static String solution(int n) {
        String answer = "";
        for (int i = 1; i <= n; i++) {
            answer += i % 2 == 0 ? "박" : "수";
        }
        return answer;
    }

    public static void main(String[] args) {
        String result = solution(5);
        System.out.println(result);
    }
}
