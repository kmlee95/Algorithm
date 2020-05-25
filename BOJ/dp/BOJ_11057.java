import java.io.IOException;
import java.util.Scanner;

public class BOJ_11057 {
    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(System.in);
        int count = Integer.parseInt(scan.nextLine().trim());
        int saveArray[][] = new int[count+1][10];
        for(int i=0; i < 10; i++) 
            saveArray[1][i] = 1;
        for(int i=1; i <= count; i++) {
            for(int j=0; j < 10; j++) {
                for(int k=0; k <= j; k++) {
                    saveArray[i][j] += saveArray[i-1][k];
                    saveArray[i][j] %= 10007;
                }
                
                
            }
        }
        int total = 0;
        for(int i=0; i < 10; i++) {
            total += saveArray[count][i];
        }
        System.out.println(total % 10007);
        scan.close();
    }
}