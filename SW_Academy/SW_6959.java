package SW_Academy;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class SW_6959 {
	public static void main(String args[]) throws Exception{
		BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(r.readLine());
		for(int test_case = 1; test_case <= T; test_case++){
			String data = r.readLine();
			int cnt = 0;
            int sum = data.charAt(0) - '0';
            for(int i = 1; i < data.length(); i++) {
                sum += data.charAt(i) - '0';
                cnt++;
                if(sum >=10) {
                    sum = sum/10 + sum%10;
                    cnt++;
                }
            }
            System.out.println("#" + test_case + " " + ((cnt%2 == 0) ? "B" : "A"));
		}
	}
}
