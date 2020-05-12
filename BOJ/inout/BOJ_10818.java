import java.io.*;

public class BOJ_10818 {
    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        try {
            int test = Integer.parseInt(br.readLine());
            String[] arrayList = br.readLine().split(" ");
            String temp;
            for(int i = 0; i < test-1; i++){
                if( Integer.parseInt(arrayList[i]) > Integer.parseInt(arrayList[i+1]) ){
                    temp = arrayList[i+1];
                    arrayList[i+1] = arrayList[i];
                    arrayList[i] = temp;
                }
            }
            System.out.println(arrayList[0] + " " + arrayList[test-1]);
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

    }
}