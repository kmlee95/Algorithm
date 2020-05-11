import java.io.*;

public class BOJ_11718 {
    public static void main(String[] args) throws IOException{ 
        BufferedReader a = new BufferedReader(new InputStreamReader(System.in));
        String test[] = new String[100];
		for(int test_case = 0; test_case <= 99; test_case++){
            test[test_case] = a.readLine();
            if(test[test_case] == null) break;
            System.out.println(test[test_case]);
		}
    }
}