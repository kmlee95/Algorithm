import java.io.*;
import java.util.*;

public class BOJ_10952 {
    public static void main(String[] args){
        try{
            BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
            int a = Integer.parseInt(r.readLine());
            for(int test_case = 0; test_case < a; test_case++){
                String line = r.readLine();
                StringTokenizer st = new StringTokenizer(line, ",");
                int sum = 0;
                while(st.hasMoreTokens())
                    sum += Integer.valueOf(st.nextToken());
                System.out.println(sum);
            }
        }catch(IOException e){
        }
    }
}