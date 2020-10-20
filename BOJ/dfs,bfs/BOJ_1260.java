import java.io.*;
import java.util.*;

public class BOJ_1260 {
    static boolean[] check = new boolean[1001];
    static int[][] checkNode = new int[1001][1001];
    static int N, M, V;

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        st = new StringTokenizer(br.readLine(), " ");
        N = Integer.parseInt(st.nextToken()); // 정점의 개수
        M = Integer.parseInt(st.nextToken()); // 간선의 개수
        V = Integer.parseInt(st.nextToken()); // 탐색을 시작할 노드 번호

        for (int i = 0; i < M; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());

            checkNode[x][y] = checkNode[y][x] = 1;
        }
        dfs(V); // dfs start
    }

    public static void dfs(int i) {
        check[i] = true;
        System.out.print(i + " ");
        for (int k = 1; k <= N; k++) {
            if (checkNode[i][k] == 1 && check[k] == false) {
                dfs(k);
            }
        }
    }

    public static void bfs(int i) {

    }
}