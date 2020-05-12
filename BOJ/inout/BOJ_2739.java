import java.io.*;

public class BOJ_2739 {
    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        try {
            int a = Integer.parseInt(br.readLine());
            for(int i = 1; i <= 9; i++) 
                System.out.println(a + " * " + i + " = " + (a*i));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}