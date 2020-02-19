import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class SW_8840 {
    public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(in.readLine());
        for (int test_case = 1; test_case <= T; test_case++) {
            long L = Long.parseLong(in.readLine());
            long num = (L / 2) * 1L;
            System.out.println("#" + test_case + " " + num * num);
        }
    }
}