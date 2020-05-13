import java.io.*;

public class BOJ_2438 {
    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        try {
            int test = Integer.parseInt(br.readLine());
            for(int i = 1; i <= test; i++){
                for(int j = 1; j <= i; j++){
                    System.out.print("*");
                }
                System.out.println();
            }
        }catch (IOException e) {
            e.printStackTrace();
        }
    }
}