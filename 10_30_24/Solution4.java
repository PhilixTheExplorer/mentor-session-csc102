import java.util.Scanner;

public class Solution4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] matrix = new int[n][n];
        int[] sumRow = new int[n];
        int[] sumCol = new int[n];
        int mainDiaSum = 0;
        int secDiaSum = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = sc.nextInt();
                sumRow[i] += matrix[i][j];
                sumCol[j] += matrix[i][j];
            }
        }
        for (int i = 0; i < n; i++) {
            mainDiaSum += matrix[i][i];
            secDiaSum += matrix[i][n - 1 - i];
        }
        boolean isMagic = true;
        for (int i = 0; i < n; i++) {
            if (sumRow[0] != sumRow[i] || sumCol[0] != sumCol[i]) {
                isMagic = false;
                break;
            }
        }
        if (!((sumRow[0] == sumCol[0]) && (sumRow[0] == mainDiaSum) && (sumRow[0] == secDiaSum))) {
            isMagic = false;
        }
        System.out.println(isMagic);

    }
}
