import java.io.*;

public class BOJ_8983 {
    static int func(int n) {
        if (n == 0) {
            return 0;
        } else {
            return n + func(n - 1);
        }
    }
    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        try {
            int n = Integer.parseInt(br.readLine());
            int sum = func(n);
            System.out.println(sum);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}