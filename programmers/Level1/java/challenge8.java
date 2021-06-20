package java;

//소수찾기
public class challenge8 {
    public static int solution(int n) {
        int answer = 0;
        boolean[] sosu = new boolean[n + 1];
        int root = (int) Math.sqrt(n);
        for (int i = 2; i <= n; i++) {
            sosu[i] = true;
        }

        for (int i = 2; i <= root; i++) {
            if (sosu[i] == true) {
                for (int j = i; j * i <= n; j++) {
                    sosu[i * j] = false;
                }
            }
        }
        for (int i = 2; i <= n; i++) {
            if (sosu[i] == true)
                answer++;
        }

        return answer;
    }

    public static void main(String[] args) {
        int result = solution(1000);
        System.out.println(result);
    }
}
