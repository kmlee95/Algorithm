package SW_Academy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

class SW_8931_Á¦·Î {
	 public static void main(String[] args) throws IOException{
	        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	        StringTokenizer st;
	        int T = Integer.parseInt(br.readLine());
	        for(int test_case=1;test_case<=T;test_case++) {
	            long answer=0;
	            int k=Integer.parseInt(br.readLine());
	            Stack<Integer> s=new Stack<Integer>();
	            
	            for(int i=0; i<k; i++) {
	                int num=Integer.parseInt(br.readLine());
	                if(num==0) s.pop();
	                else s.push(num);
	            }
	            while(!s.empty()) answer += s.pop();
	            System.out.println("#" + test_case+" " + answer);
	        }
	    }
	}
}
