import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;

public class SW_9088_다이아몬드{
    static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    static void solve(int num) throws IOException {
        int n, k;
        StringTokenizer tokenizer = new StringTokenizer(reader.readLine());
        n = Integer.parseInt(tokenizer.nextToken());
        k = Integer.parseInt(tokenizer.nextToken());
        ArrayList<Integer> arrayList = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            arrayList.add(Integer.parseInt(reader.readLine()));
        }
        Collections.sort(arrayList);
        int numMax = 0;
        for (int i = 0; i < n; i++) {
            int min = arrayList.get(i);
            int max = min + k;
            int thisMax = 0;
            for (int j = 0; j < n; j++) {
                if (min <= arrayList.get(j) && arrayList.get(j) <= max) {
                    thisMax++;
                }
            }
            numMax = Math.max(numMax,thisMax);
        }
        System.out.println("#"+num+" "+numMax);
    }
    public static void main(String args[]) throws IOException {
        int T = Integer.parseInt(reader.readLine());
        for(int test_case = 1; test_case <= T; test_case++){
            solve(test_case);
        }
    }
}