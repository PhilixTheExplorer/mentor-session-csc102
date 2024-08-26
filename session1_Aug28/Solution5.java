import java.util.Scanner;

public class Solution5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
       
        StringBuilder r = new StringBuilder();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i == 0 || j == 0 || i == j || i == n - 1 || j == n - 1 || i + j == n - 1)
                    r.append("*");
                else
                    r.append("-");
            }
            r.append("\n");
        }

        System.out.print(r);
        sc.close();
    }
}