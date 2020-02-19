import java.util.Scanner;

class SW_8888{
	public static void main(String args[]) throws Exception{
		Scanner sc = new Scanner(System.in);
		int T;
        int L, U, X;
        int result;
		T=sc.nextInt();
		for(int test_case = 1; test_case <= T; test_case++){
			L = sc.nextInt();
            U = sc.nextInt();
            X = sc.nextInt();
            result = 0;
            if(L > X){
                result = L-X;
            }else if(X>U){
                result = -1;
            }
			System.out.println("#"+test_case+" "+result);

		}
	}
}