import java.io.*;

public class BOJ_2445 {
    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        try {
            int test = Integer.parseInt(br.readLine());
            for(int i = 1; i <= test; i++){
                for(int t = 1; t <= i; t++){
                    System.out.print("*");
                }
                for(int s = 1; s <= 2*(test -i); s++){
                    System.out.print(" ");
                }
                for(int j = 1; j <= i; j++){
                    System.out.print("*");
                }
                System.out.println();
            }

            for(int i = 1; i <= test-1; i++){
                for(int t = test-i; t >= 1; t--){
                    System.out.print("*");
                }
                if(i==1){
                    System.out.print("  ");
                }else{
                    for(int k = 1; k <= 2*i; k++)
                        System.out.print(" ");
                }
                for(int j = test-i; j >= 1; j--)
                    System.out.print("*");
                System.out.println();
            }
        }catch (IOException e) {
            e.printStackTrace();
        }
        
    }
}