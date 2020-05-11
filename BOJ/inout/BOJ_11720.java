import java.io.*;

public class BOJ_11720 {
    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        try {
            int test = Integer.parseInt(br.readLine());
            String number = br.readLine();
            int sum = 0;
            for(int test_case = 0; test_case < test; test_case++){
                sum += number.charAt(test_case) - '0'; //아스키코드를 이용해 숫자로 변환
            }
            System.out.println(sum);
        } catch (IOException e) {
            e.printStackTrace();
        }
        
    }
}