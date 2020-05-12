import java.io.*;

public class BOJ_1924 {
    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        try {
            String[] line = br.readLine().split(" ");
            int day[] = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
            int sum = 0;
            for(int i = 0; i<12; i++){
                if(i == Integer.parseInt(line[0])-1) break;
                sum = sum + day[i];
            }
            sum = sum + Integer.parseInt(line[1]);
            switch(sum % 7){
                case 0 :
                    System.out.println("SUN");
                    break;
                case 1 :
                    System.out.println("MON");
                    break;
                case 2 :
                    System.out.println("TUE");
                    break;
                case 3 :
                    System.out.println("WED");
                    break;
                case 4 :
                    System.out.println("THU");
                    break;
                case 5 :
                    System.out.println("FRI");
                    break;
                case 6 :
                    System.out.println("SAT");
                    break;
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        
    }
}