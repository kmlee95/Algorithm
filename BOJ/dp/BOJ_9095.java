import java.io.*;

public class BOJ_9095 {
    private static int[] d; 
    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
        try { 
            int test = Integer.parseInt(br.readLine()); 
            while(test-- > 0) { 
                int n = Integer.parseInt(br.readLine()); 
                d = new int[n+1]; 
                for(int i=0; i< n+1; i++) { 
                    if(i == 0) d[i] =0; 
                    else if(i == 1) d[i] = 1; 
                    else if(i == 2) d[i] = 2; 
                    else if(i == 3) d[i] = d[i-1] + d[i-2] + 1; 
                    else d[i] = d[i-1] + d[i-2] + d[i-3]; 
                } 
                System.out.println(d[n]); 
            } 
        } catch (Exception e) { 
        }
    }
}