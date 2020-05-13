import java.io.*;

public class BOJ_10818 {
    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        try {
            int test = Integer.parseInt(br.readLine());
            String[] arrayList = br.readLine().split(" ");

            int max = Integer.parseInt(arrayList[0]);
            int min = Integer.parseInt(arrayList[0]);
            for(int i=0; i<test; i++){
                if(max < Integer.parseInt(arrayList[i])) max = Integer.parseInt(arrayList[i]);
                if(min > Integer.parseInt(arrayList[i])) min = Integer.parseInt(arrayList[i]);
            }

            System.out.println(min + " " + max);
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}