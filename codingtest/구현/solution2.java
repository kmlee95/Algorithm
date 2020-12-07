import java.util.Scanner;

//게임개발
public class solution2 {
    public static int n, m, x, y, direction;
    // 방문위치 저장
    public static int[][] d = new int[50][50];
    // 전체 맵 정보
    public static int[][] arr = new int[50][50];

    // 북, 동, 남, 서 방향 (0,1,2,3 문제에 정의)
    public static int dx[] = { -1, 0, 1, 0 };
    public static int dy[] = { 0, 1, 0, -1 };

    public static void left() {
        direction -= 1;
        if (direction == -1)
            direction = 3;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        n = sc.nextInt();
        m = sc.nextInt();

        // 현재 캐릭터 좌표(칸의 좌표, 바라보는 방향)
        x = sc.nextInt();
        y = sc.nextInt();
        direction = sc.nextInt();
        d[x][y] = 1;

        // 전체 맵 정보 입력
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        int cnt = 1;
        int turn_time = 0; // 4번 돌게되면 갈 방향이 없는것이므로 한칸뒤로(뒤가 바다면 종료)
        while (true) {
            left(); // 초기 왼쪽 회전
            int nx = x + dx[direction];
            int ny = y + dx[direction];

            if (d[nx][ny] == 0 && arr[nx][ny] == 0) {
                d[nx][ny] = 1;
                x = nx;
                y = ny;
                cnt += 1;
                turn_time = 0;
                continue;
            } else {
                turn_time += 1;
            }

            // 네방향 못가는 경우 check
            if (turn_time == 4) {
                // 한칸 뒤로이므로 -로 처리
                nx = x - dx[direction];
                ny = y - dy[direction];
                // 육지 일 경우
                if (arr[nx][ny] == 0) {
                    x = nx;
                    y = ny;
                } else {
                    break; // 종료
                }
                turn_time = 0;
            }
        }
        System.out.println(cnt);
    }
}
