import java.util.Scanner;

public class Solution4 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String s = sc.nextLine();
    String output = "";
    int mid = s.length() / 2;
    for (int i = 0; i < mid; i++) {
      output += s.charAt(mid - 1 - i) + "";
    }
    if (s.length() % 2 != 0) {
      output += s.charAt(mid) + "";
      for (int i = s.length() - 1; i > mid; i--) {
        output += s.charAt(i) + "";
      }
    } else {
      for (int i = s.length() - 1; i >= mid; i--) {
        output += s.charAt(i) + "";
      }
    }
    System.out.println(output);
    sc.close();
  }
}