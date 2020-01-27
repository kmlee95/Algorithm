package SW_Academy;
import java.io.*;
import java.util.*;

public class SW_1220 {
	public static void main(String args[]) throws Exception
    {
        BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
        int T = 10;
        for(int test_case = 1; test_case <= T; test_case++)
        {
            int s = Integer.parseInt(r.readLine());
            int[][] data = new int[s][s]; //sample
            int sum = 0; //n, s±Ø ±³Â÷
            StringTokenizer t;
             
            for(int i = 0; i < s; i++) {
                t = new StringTokenizer(r.readLine());
                for(int j = 0; j < s; j++) 
                    data[i][j] = Integer.parseInt(t.nextToken());
            }
             
            for (int i = 0; i < s; i++) {
                boolean check = true;
                for (int j = 0; j < s; j++) {
                    if(check && data[j][i] == 1) {
                        check = false;
                    }
                    if(!check && data[j][i] == 2) {
                        check = true;
                        sum++;
                    }
                }
            }       
            System.out.println("#" + test_case + " " + sum);
        }
    }

}
