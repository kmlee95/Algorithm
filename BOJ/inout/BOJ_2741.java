import java.io.*;

public class BOJ_2741 {
    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        try {
            int a = Integer.parseInt(br.readLine());
            for(int i = 1; i <= a; i++) 
                System.out.println(i);
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}