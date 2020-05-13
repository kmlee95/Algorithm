import java.io.*;

public class BOJ_2442 {
    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        try {
            int test = Integer.parseInt(br.readLine());
            for(int i = 1; i <= test; i++){
                for(int t = test-i; t >= 0; t--){
                    System.out.print(" ");
                }
                for(int k = 1; k <= 2*i-1; k++){
                    System.out.print("*");
                }
                System.out.println();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}