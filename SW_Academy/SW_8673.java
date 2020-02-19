import java.util.ArrayList;
import java.util.Scanner;

public class SW_8673 {
	public static void main(String args[]) throws Exception{
		Scanner sc = new Scanner(System.in);
		int T; // 
		int k; // k�� ��� ��
		int s; // �ڵ��Ƿ� 
		int result; // ���
		int a,b;
		int people;
		T=sc.nextInt(); 
		for(int test_case = 1; test_case <= T; test_case++){
			k = sc.nextInt();
			people = (int)Math.pow(2, k);
			ArrayList<Integer> list = new ArrayList<>();
			for(int i=0; i< people; i++) {
				s = sc.nextInt();
				list.add(s);
			}
			result = 0;
			people = people/2;
			for( int j=0; j<k; j++) {
				for(int t=0; t<people; t++) {
					a = list.get(t);
					b = list.get(t+1);
					result += Math.abs(a-b);
					if(a<b) {
						list.remove(t);
					}else {
						list.remove(t+1);
					}
				}
				people = people/2;
			}
			System.out.println("#"+test_case+" "+result);
		}	
	}
}
