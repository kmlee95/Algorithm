import java.io.*;

public class BOJ_2558 {
    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        try {
            int a = Integer.parseInt(br.readLine());
            int b = Integer.parseInt(br.readLine());

            System.out.println(a+b);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}