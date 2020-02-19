import java.io.*;
import java.util.*;

public class SW_2819 {
	static HashSet<String> s;
	static String[][] data;
	static int[][] move = {{-1, 0}, {1, 0}, {0, -1}, {0, 1}};
	
	public static void main(String[] args) throws Exception {
		BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(r.readLine());
		for(int test_case = 1; test_case <= T; test_case++) {
			s = new HashSet<>();
			data = new String[4][4];
			
			for(int i = 0; i < data.length; i++) {
				StringTokenizer t = new StringTokenizer(r.readLine());
				for(int j = 0; j < data[0].length; j++)
					data[i][j] = t.nextToken();
			}
			
			for(int i = 0; i < data.length; i++) {
				for(int j = 0; j < data[0].length; j++)
					func(i, j, data[i][j]);
			}
			
			System.out.println("#" + test_case + " " + s.size());
		}
	}
	
	public static void func (int i, int j, String m) {
		if(m.length() == 7) {
			s.add(m);
			return;
		}
		for(int a = 0; a < move.length; a++) {
			int x = i + move[a][0];
			int y = j + move[a][1];
			if(x >= 0 && x < data.length && y >= 0 && y <data[0].length) {
				String tmp = m + data[x][y];
				func(x, y, tmp);
			}
		}
	}
}