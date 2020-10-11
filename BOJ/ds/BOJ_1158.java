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
                queue.addLast(queue.removeFirst()); // 앞 두자리 지우고
            }
            sb.append(queue.removeFirst() + ", "); // 그다음 append를 하면서 하나더 지운다.
        }
        System.out.println(sb.toString().substring(0,sb.length()-2) + ">"); // substring -2 한 이유 : 맨 끝 엔터, ',' 지우려고..
    }
}