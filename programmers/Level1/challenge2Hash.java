import java.util.HashMap;

public class challenge2Hash {
    public static String solution(String[] participant, String[] completion) {
        HashMap<String, Integer> hmap = new HashMap<>();
        String answer = "";
        for (String player : participant)
            hmap.put(player, hmap.getOrDefault(player, 0) + 1);
        for (String player : completion)
            hmap.put(player, hmap.get(player) - 1);

        for (String key : hmap.keySet()) {
            if (hmap.get(key) != 0) {
                answer = key;
                break;
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        String[] test1 = { "leo", "kiki", "eden" };
        String[] test2 = { "leo", "eden" };
        String result = solution(test1, test2);

        System.out.println(result);
    }
}
