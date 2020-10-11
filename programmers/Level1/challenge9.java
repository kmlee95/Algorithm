public class challenge9 {
    public static int solution(String s) {
        int answer = 0;
        // answer = Integer.parseInt(s);
        boolean sign = false;

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ch == '-')
                sign = true;
            else if (ch != '+') {
                answer = answer * 10 + (ch - '0');
            }
        }
        return (sign ? -1 : +1) * answer;
    }

    public static void main(String[] args) {
        int result = solution("-1234");
        System.out.println(result);
    }
}
