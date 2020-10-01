//p와 Y
public class challenge7 {
    public static boolean solution(String n) {
        boolean answer = true;
        String[] strArray = n.split("");
        int p = 0;
        int y = 0;

        for (String s : strArray) {
            if (s.equals("p") || s.equals("P"))
                p++;
            if (s.equals("y") || s.equals("Y"))
                y++;
        }

        if (p != y)
            answer = false;

        // 다른사람 풀이
        // s = s.toUpperCase();
        // return s.chars().filter( e -> 'P'== e).count() == s.chars().filter( e ->
        // 'Y'== e).count();

        return answer;
    }

    public static void main(String[] args) {
        boolean result = solution("pPoooyY");
        System.out.println(result);
    }
}
