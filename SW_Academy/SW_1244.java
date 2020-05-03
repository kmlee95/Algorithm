import java.util.Arrays;
import java.util.Scanner;
 
public class SW_1244 {
    static int n;
    static int result = 0;
    static char[] num;
    static void dfs(final int cur, final int cnt) {
        if(cnt==n) {
            result=Math.max(result,Integer.parseInt(String.valueOf(num)));
            return;
        }
        for(int i=cur; i<num.length; i++) {
            for(int j=i+1; j<num.length; j++) {
                if(num[i] <= num[j]) {
                    char temp = num[i];
                    num[i] = num[j];
                    num[j] = temp;
                    dfs(i, cnt + 1);
                    temp = num[i];
                    num[i] = num[j];
                    num[j] = temp;
                }
            }
        }
    }
    public static void main(final String[] args) {
        final Scanner sc = new Scanner(System.in);
        final int T = sc.nextInt();
        for(int test_case =1; test_case<=T;test_case++)
        {
            result = 0;
            num = sc.next().toCharArray();
            n = sc.nextInt();
            dfs(0,0);
            System.out.println("#"+test_case+" "+result);
        }
    }
     
}
