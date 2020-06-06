import java.io.*;
import java.util.*;

public class BOJ_9093 {
    private static String input;
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        Stack<Character> stack = new Stack<Character>();

        int n = Integer.parseInt(br.readLine());    //경우의 수

        for (int i = 0; i < n; i++) {
            input = br.readLine();
            input += "\n";
            StringBuilder sb = new StringBuilder("");
 
            for (int j = 0; j < input.length(); j++) {
                if (input.charAt(j) == ' ' || input.charAt(j) == '\n') {
                    while (!stack.isEmpty()) {
                        sb.append(stack.peek());
                        stack.pop();
                    }
                    if (input.charAt(j) == ' ') {
                        sb.append(input.charAt(j));
                    }
                } else {
                    stack.push(input.charAt(j));
                }
            }
            bw.write(sb.toString() + "\n");
        }
        br.close();
        bw.flush();
        bw.close();
    }
}