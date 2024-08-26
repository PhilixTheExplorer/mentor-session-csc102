import java.util.Scanner;

public class Solution2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.next();
        int cat = 0;
        int mouse = 0;
        for (int i = 0; i < input.length() - 2; i++) {
            if (input.charAt(i) == 'c' && input.charAt(i + 1) == 'a' && input.charAt(i + 2) == 't')
                cat++;
        }
        for (int i = 0; i < input.length() - 4; i++) {
            if (input.charAt(i) == 'm' && input.charAt(i + 1) == 'o' && input.charAt(i + 2) == 'u'
                    && input.charAt(i + 3) == 's' && input.charAt(i + 4) == 'e')
                mouse++;
        }
        if (cat == mouse)
            System.out.println("true");
        else
            System.out.println("false");
        sc.close();
    }
}