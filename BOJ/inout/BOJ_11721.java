import java.io.*;

public class BOJ_11721 {
    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        try {
            String input = br.readLine();
            for(int i =0; i < input.length(); i++){
                System.out.print(input.charAt(i));
                if (i % 10 == 9) System.out.println();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}