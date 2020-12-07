import java.util.Scanner;

public class solution1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int result = 0;
        int next_row = 0;
        int next_height = 0;
        String test = sc.nextLine();
        int[][] check = { { -2, -1 }, { -2, 1 }, { 2, 1 }, { 2, -1 }, { -1, 2 }, { 1, 2 }, { -1, -2 }, { 1, -2 } };

        char[] test1 = test.toCharArray();

        int a = (int) test1[0] - 96;
        int b = (int) test1[1] - 48;

        for (int i = 0; i < check.length; i++) {
            next_row = a + check[i][0];
            next_height = b + check[i][1];
            if (next_row >= 1 && next_row <= 8 && next_height >= 1 && next_row <= 8)
                result += 1;
        }
        sc.close();
        System.out.println(result);
    }
}
