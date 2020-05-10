import java.io.*;

public class BOJ_10950 {
    public static void main(String[] args){
        BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
        try {
            int T = Integer.parseInt(r.readLine());
            for(int test_case = 0; test_case < T ; test_case ++){
                String[] line = r.readLine().split(" ");
                int a = Integer.parseInt(line[0]);
                int b = Integer.parseInt(line[1]);
                System.out.println(a+b);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}