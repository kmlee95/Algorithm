import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SW_9317_받아쓰기{
	public static void main(String[] args) throws IOException {
		BufferedReader r= new BufferedReader(new InputStreamReader(System.in)); 
		int T = Integer.parseInt(r.readLine());
		
		for(int test_case = 1; test_case <= T; test_case++)
		{
			int sum = 0;
			int N = Integer.parseInt(r.readLine());
			String a = r.readLine();
			String b = r.readLine();
			
			for(int i = 0; i < N;  i++) {
				if(a.charAt(i) == b.charAt(i))
                    sum++;
			}
			System.out.println("#" + test_case + " " + sum);
		}
	}
}
