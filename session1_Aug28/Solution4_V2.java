import java.util.Scanner;

public class Solution4_V2 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String s = sc.nextLine();
    int mid = s.length() / 2;
    String output = "";
    StringBuilder first = new StringBuilder(s.substring(0, mid));
    output += first.reverse().toString();
    if (s.length() % 2 == 0) {
      StringBuilder last = new StringBuilder(s.substring(mid));
      output += last.reverse().toString();
    } else {
      StringBuilder last = new StringBuilder(s.substring(mid + 1));
      output += s.charAt(mid) + last.reverse().toString();
    }
    System.out.println(output);
    sc.close();
  }
}