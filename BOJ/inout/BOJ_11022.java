import java.io.*;

public class BOJ_11022 {
    public static void main(String[] args){
        try{
            BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
            int a = Integer.parseInt(r.readLine());
            for(int test_case = 1; test_case <= a; test_case++){
                String[] line = r.readLine().split(" ");
                int sum = Integer.parseInt(line[0]) + Integer.parseInt(line[1]);
                System.out.println("Case #" + test_case + ": " + line[0] + " + " + line[1] + " = " + sum);
            }
        }catch(IOException e){
        }
    }
}