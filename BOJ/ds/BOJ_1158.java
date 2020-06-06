import java.io.*;
import java.util.*;

public class BOJ_1158 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Deque<Integer> queue = new ArrayDeque<>();

        StringBuilder sb = new StringBuilder("<");
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());

        for (int i = 1; i <= n; i++){
            queue.add(i);
        }

        while(!queue.isEmpty()){
            for (int i = 0; i < k-1; i++){
                queue.addLast(queue.removeFirst());
            }
            sb.append(queue.removeFirst() + ", ");
        }
        System.out.println(sb.toString().substring(0,sb.length()-2) + ">");
    }
}