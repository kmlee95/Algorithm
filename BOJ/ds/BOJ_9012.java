import java.io.*;
import java.util.Stack;

public class BOJ_9012 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int test_case = Integer.parseInt(br.readLine());
        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < test_case; i++){
            boolean check = true;
            String input = br.readLine();
            char temp;

            for(int j = 0; j < input.length(); j++){
                temp = input.charAt(j);

                if(temp == '('){
                    stack.push(temp);
                }else if (temp == ')'){
                    if(!stack.isEmpty()){
                        stack.pop();
                    }else{
                        check = false;
                        break;
                    }
                }
            }
            if(!stack.isEmpty()) check = false;

            if(check){
                System.out.println("YES");
            }else{
                System.out.println("NO");
            }
        }
    }
}