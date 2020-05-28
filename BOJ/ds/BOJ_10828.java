import java.io.*;
import java.util.*;

/**
 * BOJ_10828
 */
public class BOJ_10828 {
    private static int test_case; 
    private static Stack<Integer> stack;

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        test_case = Integer.parseInt(br.readLine()); // testcase 수

        stack = new Stack<Integer>(); //stack
        StringTokenizer input = null;
        StringBuilder sb = new StringBuilder();


        for (int i = 0; i < test_case; i++){
            input = new StringTokenizer(br.readLine());
            String type = input.nextToken();
            if("push".equals(type)){
                int num = Integer.parseInt(input.nextToken());
                stack.push(num);
            }else if("top".equals(type)){
                sb.append((stack.size() == 0)? -1 + "\n" : stack.peek() + "\n");
            }else if("pop".equals(type)){
                sb.append((stack.size()==0)? -1+"\n":stack.pop() + "\n");
            }else if("size".equals(type)){
                sb.append(stack.size() + "\n");
            }else if("empty".equals(type)){
                sb.append((stack.isEmpty())? 1 +"\n" : 0 + "\n");
            }
        }
        System.out.println(sb.toString());
    } 
}