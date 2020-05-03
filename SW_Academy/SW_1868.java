import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
 
public class SW_1868 {
    static class CheckPoint{
        int i,j;
 
        public CheckPoint(int i, int j) {
            super();
            this.i = i;
            this.j = j;
        }
         
    }
    static int deli[]= {0,0,1,1,1,-1,-1,-1};//선택한 곳 중앙을 (0,0) 가정하에 주변을 탐색할 좌표 (0,1), (0,-1), (1,0)....
    static int delj[]= {1,-1,0,1,-1,0,1,-1};
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        for (int test_case = 0; test_case < T; test_case++) {
            int N = Integer.parseInt(br.readLine());//현재 사이즈 N*N
            char carr[][] = new char[N][N];//초기 지뢰 위치, 지뢰 없는 곳 설정
            int arr[][] = new int[N][N];

            for (int i = 0; i < N; i++) { //지뢰, 지뢰 없는 곳 setting
                String s = br.readLine();
                for (int j = 0; j < N; j++) {
                    carr[i][j]=s.charAt(j);
                }
            }
             
            for (int i = 0; i < N; i++) {
                for (int j = 0; j < N; j++) {
                    if(carr[i][j]=='*') // 지뢰 있는 곳에 -1
                        arr[i][j]=-1;
                    else {
                        for (int k = 0; k < 8; k++) {//선택한 지점의 주변을 탐색
                            int ni=i+deli[k];
                            int nj=j+delj[k];
                            if(ni<0 || ni>=N || nj<0 || nj>=N)
                                continue;
                            if(carr[ni][nj]=='.')
                                continue;
                            arr[i][j]++; //선택한 지점의 주변을 탐색하면서 *가 있으면 1증가(최대 8) , 기본은 0
                        }
                    }
                }
            }
             
            boolean visited[][]=new boolean[N][N];// 기본 false
            int result=0;
            Queue<CheckPoint> q = new LinkedList<>();
            for (int i = 0; i < N; i++) {
                for (int j = 0; j < N; j++) {
                    if(visited[i][j]) // 이미 방문을 했으면 제외
                        continue;
                    if(arr[i][j]==0) { //지뢰가 없는 곳
                        result++;
                        q.add(new CheckPoint(i,j)); //queue에 넣고(좌표)
                        visited[i][j]=true; //visited = true
                    }
                    while(!q.isEmpty()) { //queue가 비어있지 않다면
                        CheckPoint p = q.poll(); //맨앞에 있는 값을 꺼내서
                        for (int k = 0; k < 8; k++) {
                            int ni=p.i+deli[k];
                            int nj=p.j+delj[k];
                            if(ni<0 || ni>=N || nj<0 || nj>=N)
                                continue;
                            if(visited[ni][nj])
                                continue;
                            visited[ni][nj]=true;
                            if(arr[ni][nj]==0) //0(주변에 지뢰가 없음)을 계속 찾아 나간다.
                                q.add(new CheckPoint(ni,nj));
                        }
                    }
                }
            }
            int cnt = 0;
            for (int i = 0; i < N; i++) {
                for (int j = 0; j < N; j++) {
                    if(arr[i][j]!=-1 && !visited[i][j])
                        cnt++;
                }
            }
             
            System.out.println("#"+(test_case+1)+" "+(result+cnt));
        }
    }
}