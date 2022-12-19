//Дана квадратная матрица. Вывести на экран элементы, стоящие на диагонали
import java.util.Scanner;

public class task6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Square matrix dimension: ");
        int n = sc.nextInt();
        int m = n;
        int k = args.length;
        int[][] a = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.println("Enter the matrix element: ");
                a[i][j] = sc.nextInt();
            }
        }
        System.out.println("The matrix: ");
        printValueArr(a);

        System.out.println("Diagonal of matrix: ");
        for (int i = a.length - 1; i >= 0; i--) {
            for (int j = 0; j < m; j++) {
                if (i == j) {
                    System.out.print(a[i][j] + " ");
                }
            }
        }
        System.out.println();
    }

    private static void printValueArr(int[][] arrTarget) {
        for (int[] row : arrTarget) {
            for (int val : row)
                System.out.printf("%4d", val);
            System.out.println();
        }
    }
}