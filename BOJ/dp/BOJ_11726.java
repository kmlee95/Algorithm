import java.io.*;

public class BOJ_11726 {
    private static int[] d; 
    private static void process(int n) { 
        for(int i=0; i<=n; i++) { 
            if(i <= 2) 
                d[i] = i; 
            else { 
                d[i] = (d[i-1] + d[i-2]) % 10007; 
            }
         } 
    } 
    public static void main(String[] args) { 
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
        try { 
            int n = Integer.parseInt(br.readLine()); 
            d = new int[n+1]; 
            process(n); 
            System.out.print(d[n]); 
        } catch (Exception e) { 
            // TODO: handle exception e.printStackTrace(); 
        } 
    }
}