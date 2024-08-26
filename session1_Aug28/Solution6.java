import java.util.Scanner;

public class Solution6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        sc.close();
        int len = s.length();
        if (len % 2 == 0) {
            System.out.println("Invalid word");
            return;
        }
        for (int i = 0; i < len; i++) {
            for (int j = 0; j < len; j++) {
                if (i == j) {
                    System.out.print(s.charAt(i));
                } else if (i + j == len - 1) {
                    System.out.print(s.charAt(len - 1 - i));
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}