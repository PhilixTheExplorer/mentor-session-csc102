import java.util.*;

public class Solution3 {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String input = sc.next();
    sc.close();
    int mid = Integer.parseInt(input.charAt(4) + "");
    int result = 0;
    int i = mid % 2 == 0 ? 0 : 1;
    for (; i < input.length(); i += 2) {
      result += Integer.parseInt(input.charAt(i) + "");
    }
    System.out.println(result);
  }
}