package SW_Academy;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

class SW_4299
{
	public static void main(String args[]) throws Exception
	{
		BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
		int T;
		T = Integer.parseInt(r.readLine());

        for(int test_case = 1; test_case <= T; test_case++)
		{
        	StringTokenizer t = new StringTokenizer(r.readLine());
        	int n = Integer.parseInt(t.nextToken());
        	int s = Integer.parseInt(t.nextToken());
        	
        	boolean[] data = new boolean[n];
        	t = new StringTokenizer(r.readLine());
        	int fi = -1;
        	boolean checkfirst = true;
        	for(int i = 0; i < n; i++) {
        		if(t.nextToken().equals("0"))
        			data[i] = false;
        		else {
        			data[i] = true;
        			if(checkfirst==true) {
        				fi = i;
        				checkfirst = false;
        			}
        		}
        	}
        	
        	if(fi == -1)
        		fi = 0;
        	
        	int result = 0;
        	for(int i = fi; i < n; i+=s) {
        		if(i-s>=0) {
        			if(data[i-s]==false) {
        				result++;
        				data[i-s]=true;
        			}
        		}
        		if(i+s<n) {
        			if(data[i+s]==false) {
        				result++;
        				data[i+s]=true;
        			}
        		}
        	}
        	System.out.println("#" + test_case + " " + result);
		}
	}
}