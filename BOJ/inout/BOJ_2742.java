import java.io.*;

public class BOJ_2742 {
    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        try {
            int a = Integer.parseInt(br.readLine());
            for(int i = a; i >= 1; i--) 
                System.out.println(i);
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}