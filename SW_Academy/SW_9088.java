import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SW_9088 {
	static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    public static void main(String[] args) throws IOException{
        int T = Integer.parseInt(reader.readLine());
         
        for(int test_case = 1;test_case<=T;test_case++) {
        	String[] ans = reader.readLine().split("");
        	int a=0, b=0, c=0;
            boolean check = false; 
            for(int i = 0; i<ans.length; i++) {
                if(ans[i].equals("a"))
                    a++;
                else if(ans[i].equals("b"))
                    b++;
                else if(ans[i].equals("c"))
                    c++;
            }
            if(Math.abs(a - b) <= 1 && Math.abs(b -  c) <= 1 && Math.abs(c - a) <= 1)
                check = true;
             
            System.out.println("#" + test_case + (check?" YES":" NO"));
        }
    }
}