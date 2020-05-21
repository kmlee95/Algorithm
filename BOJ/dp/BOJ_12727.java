import java.io.*;

public class BOJ_12727 {
        private static int[] d;
        public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int n = Integer.parseInt(br.readLine()); 
        d = new int[n+1]; 
        for(int i=0; i<n+1; i++) { 
            if(i==0) d[i] = 0; 
            else if(i == 1) d[i] = 1; 
            else if(i == 2) d[i] = 3; 
            else d[i] = (d[i-1] + 2*d[i-2]) % 10007; 
        } 
            System.out.print(d[n]);
    }
}