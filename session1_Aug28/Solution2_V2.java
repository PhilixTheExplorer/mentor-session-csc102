import java.util.Scanner;

public class Solution2_V2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.next();
        sc.close();
        int cat = 0;
        int mouse = 0;
        for (int i = 0; i < input.length(); i++) {
            // To avoid index out of bound
            // Check condition first
            if (i + 2 < input.length() && input.substring(i, i + 3).equals("cat"))
                cat++;
            if (i + 4 < input.length() && input.substring(i, i + 5).equals("mouse"))
            mouse++;
        }
        System.out.println(cat == mouse);
    }
}