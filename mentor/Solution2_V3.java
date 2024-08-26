import java.util.Scanner;

public class Solution2_V3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.next();
        int cat = input.split("cat", -1).length;
        int mouse = input.split("mouse", -1).length;
        System.out.println(cat == mouse);
        sc.close();
    }
}